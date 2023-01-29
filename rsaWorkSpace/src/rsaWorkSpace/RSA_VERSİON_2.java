package rsaWorkSpace;



import java.math.BigInteger;
import java.util.Scanner;

public class RSA_VERSİON_2 {
	
	

	/*Algorithm Design
	 * 
	 * Generating Keys... 
	 * select two prime numbers (P,Q) 
	 * calculate product of P andQ
	 *  caculate totient=fİ(n)=(P-1)*(Q-1) 
	 * then select a public key (E) 
	 * -Must be prime
	 * -Must be less than totient 
	 * -Must not be factor of the totient 
	 * select a private key (D) Product of D and E, dividen by T must result in a remainder
	 * of 1 so (D*E)%t==1
	 * Encryption.... (Message^E)%N=Chipper Text Decryption... (Chipper^D)%N=Message
	 * 
	 */
	
	
	//Note:In this project, BigInteger data type was used because RSA algorithm deals with large numbers.
	//double or integer data type overflows, for a stable algorithm structure BigInteger data type is chosen.
	static BigInteger p = new BigInteger("239");
	//initialization value of p is assigned and p value is defined, p and q must be a prime number.
	static BigInteger q = new BigInteger("293");
	//initialization value of q is assigned and q value is defined, p and q must be a prime number.
	static BigInteger product = new BigInteger("1");
	//temporary initialization value of product is assigned Normally, "product=p*q"
	static BigInteger totient= new BigInteger("1");
	//temporary initialization value of totient is assigned Normally, "totient =(p-1)*(q-1)"
	static BigInteger publicKey=new BigInteger("97"); // !! "E" stands for public key
	/*public key is defined, but its value is found with the help of PublicKeyGenerator() function.
	PublicKeyGenerator() function might find more than one value which is suitable. 
	you can select a value from PublicKeyGenerator() function's outputs.
 	your choice depends on how secure system you want.
	but if you choose a too large number, system will be slow.*/
	static BigInteger privateKey= new BigInteger("7881"); //"D" stands for public key
	//After assigning value of public key, we need to assign privateKey with the help of privateKeyGen() function.
	//Unlike publicKey() function, privateKey() function returns just one suitable value...
	static Scanner input = new Scanner(System.in);
	//object of scanner class named input is defined to take some value from user.
	
	public static void main(String[] args) {
		//product=p.multiply(q);
		//totient=p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
		//MainMenu();
		//System.out.println(BinaryToDecimal("111111"));
		//System.out.println(DecimalToBinary(BigInteger.valueOf(63)));
		//PrimeNumberFinder(200,300); // to define p and q values.
		//PublicKeyGenerator();
		//PrivateKeyGenerator();
		//System.out.println(Encryption(BigInteger.valueOf(456897654)));
		//Decryption(BigInteger.valueOf(207925));
		Frame frame = new Frame();
		
	}
	
	private static void PublicKeyGenerator() {
		/*Coditions to be met for publicKey
		 * -Must be prime
		 * -Must be less than totient 
		 * -Must not be factor of the totient 
		 * */
		boolean control;
		for(BigInteger i= new BigInteger("1"); totient.compareTo(i)==1; i=i.add(BigInteger.ONE)) { //First Loop
			//with the first loop, contidion of being less than totient is provided.
			control = true;
			for(BigInteger k = new BigInteger("2"); k.compareTo(i.sqrt())==-1; k=k.add(BigInteger.ONE) ) {//Second Loop
				//with the second loop, condition of being prime is provided.
				if(i.mod(k).compareTo(BigInteger.ZERO)==0) control=false;
				//the condition block above checks every number from 2 to squart value of i to define related i value is prime or not.
				//if this state is true, control value will be false so, related i value won't print.(control value is checked last if condition)
				if(i.mod(totient).compareTo(BigInteger.ZERO)==0) control=false;
				//the condition block above checks whether "i" is a factor of totient value or not.
				
			}
			if(control) System.out.println(i);
			//At the end of the block, control value is checked.
		}
			
	}
	
	private static void PrivateKeyGenerator() {
		//(D*E)%T==1 
		BigInteger i = new BigInteger("0");
		for ( i = new BigInteger ("1"); i.multiply(publicKey).mod(totient).compareTo(BigInteger.ONE)!=0; i=i.add(BigInteger.ONE)) {
			
		} System.out.println(i);
		
	}
	
	private static BigInteger Encryption(BigInteger message) {
		
		BigInteger chipperText= new BigInteger("1");
		for(BigInteger i = new BigInteger("0"); i.compareTo(publicKey)!=0; i=i.add(BigInteger.ONE)) {
			//message^publickey mod product
			chipperText=chipperText.multiply(message);
		}
		
		return chipperText.mod(product);
		
	}
	
	private static BigInteger Decryption(BigInteger chipperText) { //(Chipper^D)%N=Message
		BigInteger message= new BigInteger("1");
		for(BigInteger i = new BigInteger("0"); i.compareTo(privateKey)!=0; i=i.add(BigInteger.ONE)) {
			// chipperText^privatekey mod product
			message=message.multiply(chipperText);
		}
		
		return message.mod(product);
		
		
		
	}
	
	public static void PrimeNumberFinder(int border1, int border2) {
		Boolean control;
		int sizeOfPrimes = 0;
		for (int i = border1; i <= border2; i++) {
			control = true;
			for (int k = 2; k <= Math.sqrt(i); k++) {

				if (i % k == 0)
					control = false;

			}
			if (control && i!=1) {
				sizeOfPrimes++;
				System.out.printf("%d. Prime Number is %d \n", (sizeOfPrimes), i);

			}
		}

	}
	
	public static void EncryptionMenu() { //Encryption Menu

//*************************************Message Input************************************************************************
		
	
		String message ="yavuz  serhat d sfsd fsd fd s f sdf sdf sd fsd f sdf sd fsd f sdf sd fds f d   d";
				
		

//**************************************Message Input*********************************************************************
		char [] messageChar=message.toCharArray();
		int border = messageChar.length;
		int counter=1;
		for(int i=0; i<border; i++) {
			if(messageChar[i]==' ' && messageChar[i+1]!=' ') counter++;
	
		}
		
		System.out.printf("your text has %d words %n",counter);
		
		

		int sizeOfMessage=message.length();
		int messageInt [] = new int[sizeOfMessage];
		for(int i=0; i<message.length(); i++) {
			messageInt[i]=(int) message.charAt(i); // converting every chracter to ascii code
			
		}
		BigInteger  chipperInt [] = new BigInteger[messageInt.length]; 
		for(int i=0; i<=message.length()-1; i++) {
			chipperInt [i]=Encryption(BigInteger.valueOf(messageInt[i]));// encrypting every ascii code to cipper text
		}
		System.out.println("Successfully Encrypted !\nYour Chipper Text :");
		String BinarySystemArray[]=new String[sizeOfMessage];
		for (int i =0; i<sizeOfMessage; i++) {
			BinarySystemArray[i]=DecimalToBinary(chipperInt[i]);
	
		}
		String showing="";
		
		for(int i =0; i<sizeOfMessage; i++) {
			
			showing=showing+ (char) 34+BinarySystemArray[i]+(char) 34 +",";
			
			
		}
		//System.out.println(showing);
		String eventualShowing="{" + showing.substring(0,(showing.length()-1) ) +"};";
		System.out.println(eventualShowing);
		
		

		
		MainMenu();
			
	}
	
	public static void DecryptionMenu() { //DECRYPTİON MENU
		System.out.println("");
//***************************************Chipper Text Input**************************************************************************
		
	
		
		
		String [] chipperBinary=  {"10101010110001","1010001101","1000011010110001","1000110001111101","1100000011001110","111101101011110","111101101011110","1010000101010011","1000101011100111","10000000100011100","1001110001100000","1010001101","1000101001011101","111101101011110","1000111100111001","111101101011110","1010000101010011","1010001111110010","1010000101010011","1000111100111001","111101101011110","1010001111110010","1010000101010011","1000111100111001","111101101011110","1010001111110010","1000111100111001","111101101011110","1010000101010011","111101101011110","1010001111110010","111101101011110","1010000101010011","1000111100111001","1010001111110010","111101101011110","1010000101010011","1000111100111001","1010001111110010","111101101011110","1010000101010011","1000111100111001","111101101011110","1010001111110010","1010000101010011","1000111100111001","111101101011110","1010001111110010","111101101011110","1010000101010011","1000111100111001","1010001111110010","111101101011110","1010000101010011","1000111100111001","111101101011110","1010001111110010","1010000101010011","1000111100111001","111101101011110","1010001111110010","111101101011110","1010000101010011","1000111100111001","1010001111110010","111101101011110","1010000101010011","1000111100111001","111101101011110","1010001111110010","1000111100111001","1010000101010011","111101101011110","1010001111110010","111101101011110","1000111100111001","111101101011110","111101101011110","111101101011110","1000111100111001"};
		
	
		
//***************************************Chipper Text Input********************************************************************************
		int chipperBinarySize=chipperBinary.length;
		int [] chipperInt= new int [chipperBinarySize];
		for(int i =0; i<chipperBinarySize; i++) {
			
			chipperInt[i]=BinaryToDecimal(chipperBinary[i]);
		
		}
		

		BigInteger [] messageInt=new BigInteger [chipperInt.length];
		int arrayLength=chipperInt.length;
		String text ="";
		
		for(int i=0; i<=arrayLength-1; i++) {
			messageInt[i]=Decryption(BigInteger.valueOf(chipperInt[i]));
		}
		for(int i =0; i<= arrayLength-1; i++) {
			char ch = (char) messageInt[i].intValue(); //converting ascii code to chracter.
			text =text+ch; // ordering every chracter.
		}
		
		System.out.println("your message is: " +text);
		System.out.println("");
		MainMenu();

	}
	
	public static void MainMenu() {
		System.out.println();
		System.out.println("To Encryption, enter '1' \nTo Decryption enter, '2' ");
		byte answer = input.nextByte();
		switch (answer) {
		case 1: 
			EncryptionMenu();
		case 2:
			DecryptionMenu();
		
		}
			
	}
	
	public static String DecimalToBinary(BigInteger decimal) {

		String binaryNumberHolder = "";
		BigInteger modula=new BigInteger("0");
		while (decimal.compareTo(BigInteger.ZERO)!=0) {
			modula = decimal.mod(BigInteger.TWO);
			binaryNumberHolder = String.valueOf(modula) + binaryNumberHolder;
			decimal = decimal.divide(BigInteger.TWO);

		}
		return binaryNumberHolder;

	}
	
	//input==111111
	public static int BinaryToDecimal(String argument) {
		int decimalSummation=0;
		int sizeOfEleman=argument.length();//6
		int k=0;
		for(int i=(sizeOfEleman-1); i!=-1;  i-- ) {
		decimalSummation+=Integer.valueOf(argument.substring(i,(i+1)))*(Math.pow(2, k));
		k++;
			
			
		}
		return decimalSummation;

	}
	
	

	}
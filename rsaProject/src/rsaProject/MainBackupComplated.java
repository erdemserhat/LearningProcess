package rsaProject;

import java.math.BigInteger;
import java.util.Scanner;

public class MainBackupComplated {

	/*
	 * Generating Keys... 
	 * select two prime numbers (P,Q) 
	 * calculate product of P andQ
	 *  caculate totient=(P-1)*(Q-1) 
	 * then select a public key (E) 
	 * -Must be prime
	 * -Must be less than totient 
	 * -Must not be factor of the totient 
	 * select a private key (D) Product of D and E, dividen by T must result in a remainder
	 * of 1 so (D*E)%t==1
	 * 
	 * Encryption.... (Message^E)%N=Chipper Text Decryption... (Chipper^D)%N=Message
	 * 
	 * Acording to information below create an algorithm...
	 */
	
	static BigInteger p = new BigInteger("251"); //*****
	static BigInteger q = new BigInteger("67"); //******
	static BigInteger product = new BigInteger("1");
	static BigInteger totient= new BigInteger("1");
	static BigInteger publicKey=new BigInteger("79"); //E
	static BigInteger privateKey= new BigInteger("7519"); //D
	static Scanner input = new Scanner(System.in);
	//96805,37310,89575
	
	public static void main(String[] args) {
		product=p.multiply(q);
		totient=p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
		//
		//PrivateKeyGenerator();
		//System.out.println(Encryption(BigInteger.valueOf(126)));
		//System.out.println(Decryption(BigInteger.valueOf(8039)));
		//PublicKeyGenerator();
		//System.out.println(Encryption(BigInteger.valueOf(97)));
		//System.out.println(Decryption(BigInteger.valueOf(76)));
		//char [] text = {'s','b','c','d'};
		//int ascii = (int) text[0];
		//System.out.println(ascii);
		//FirstMenu();
		MainMenu();
		//EncryptionMenu();
	}
	
	private static void PublicKeyGenerator() {
		boolean control = true;
		for(BigInteger i= new BigInteger("1"); totient.compareTo(i)==1; i=i.add(BigInteger.ONE)) {
			control = true;
			for(BigInteger k = new BigInteger("2"); k.compareTo(i.sqrt())==-1;k=k.add(BigInteger.ONE) ) {
				if(i.mod(k).compareTo(BigInteger.ZERO)==0) control=false;
				if(i.mod(totient).compareTo(BigInteger.ZERO)==0) control=false;
				
			}
			if(control) System.out.println(i);
		}
			
	}
	
	private static void PrivateKeyGenerator() {
		//(D*E)%t==1
		BigInteger i = new BigInteger("0");
		for ( i = new BigInteger ("1"); i.multiply(publicKey).mod(totient).compareTo(BigInteger.ONE)!=0; i=i.add(BigInteger.ONE)) {
			
		} System.out.println(i);
		
	}
	
	private static BigInteger Encryption(BigInteger message) {
		
		BigInteger chipperText= new BigInteger("1");
		for(BigInteger i = new BigInteger("0"); i.compareTo(publicKey)!=0; i=i.add(BigInteger.ONE)) {
			
			chipperText=chipperText.multiply(message);
		}
		
		return chipperText.mod(product);
		
	}
	
	private static BigInteger Decryption(BigInteger chipperText) { //(Chipper^D)%N=Message
		BigInteger message= new BigInteger("1");
		for(BigInteger i = new BigInteger("0"); i.compareTo(privateKey)!=0; i=i.add(BigInteger.ONE)) {
			
			message=message.multiply(chipperText);
		}
		
		return message.mod(product);
		
		
		
	}
	
	public static void FirstMenu() {
		System.out.println("Welcome to RSA Algorithm...");
		System.out.println("Firstly, you need to define tokens and keys let's get started by definening p and q values");
		
		System.out.println("Please enter the first border to find prime numbers (min value) :");
		int border1 = input.nextInt();
		System.out.println("Please enter the second border to find prime numbers (max value):");
		int border2 = input.nextInt();
		boolean control;
		int sizeOfPrimeNumbers = 0;
		

		for (int i = border1; i <= border2; i++) {
			control = true;
			for (int k = 2; k <= (i / 2); k++) {

				if (i % k == 0)
					control = false;

			}
			if (control && i!=1) {
				sizeOfPrimeNumbers++;

			}

		} 
		System.out.println("Araliktaki asal sayi adedi: " +sizeOfPrimeNumbers);
		int[] primeNumbers= new int[sizeOfPrimeNumbers];
		int j =0;
		
		for (int i = border1; i <= border2; i++) {
			control = true;
			for (int k = 2; k <= (i / 2); k++) {

				if (i % k == 0)
					control = false;

			}
			if (control && i!=1) {
				primeNumbers[j]=i;
				j++;

			}

		} for(int i =0 ; i<primeNumbers.length; i++) {
			
			System.out.println("Araliktaki " +(i+1)+" . Asal Sayiniz : " + primeNumbers[i]);
			
			
			
		}
		System.out.println("Let's select the p and q values enter the number of prime numbers for P :");
		int p1=input.nextInt();
		p=BigInteger.valueOf(primeNumbers[p1-1]);
		System.out.println("enter the number of Q :");
		int q1 =input.nextInt();
		q=BigInteger.valueOf(primeNumbers[q1-1]);
		System.out.println();
		System.out.printf("Okey, your p value is set as %d and q is set %d",p,q);
		System.out.println("Let's continue with definening public key..");
		System.out.println("choose your public key from below");
		PublicKeyGenerator();
		publicKey=BigInteger.valueOf(input.nextInt());
		System.out.printf("Perfect ! your public key is set as %d", publicKey);
		System.out.println();
		PrivateKeyGenerator();
		System.out.printf("And finally your private key is found as %d", privateKey);
		System.out.println("Now, you're ready");
		EncryptionMenu();
	}
	
	public static void EncryptionMenu() { //Encryption Menu
		//System.out.println("Enter the text which you want to encrypt :");
		//System.out.println("");
		//Scanner input2=new Scanner(System.in);
		//String message = input2.nextLine();
		//Sonradan Eklenen
		// Şifreelenecek Metin "message" stringine atanır
		//********************************Message Input*********************************
		
		
		
		String message ="Ultimate Text !";
		
		
		
		
		//********************************Message Input*********************************
		int messageInt [] = new int[message.length()];
		for(int i=0; i<=message.length()-1; i++) {
			messageInt[i]=(int)message.charAt(i);
			
		}
		BigInteger  chipperInt [] = new BigInteger[messageInt.length];
		for(int i=0; i<=message.length()-1; i++) {
			chipperInt [i]=Encryption(BigInteger.valueOf(messageInt[i]));
		}
		System.out.println("Take not the your chipper texts");
		String showing="";
		for(int i=0; i<=message.length()-1; i++) {
			showing=showing+chipperInt[i] +",";
			
		}
		String ultimateShowing = "{" +showing.substring(0,showing.length()-1) +"};";
		System.out.println(ultimateShowing);
		System.out.printf("your text length is : %d", message.length() );
		//System.out.printf("to decryption use = private key: %d , publickey: %d , p value is %d , q value is %d"
				// ,privateKey,publicKey,p,q);
		System.out.println("");
		MainMenu();
			
	}
	
	public static void DecryptionMenu() { //DECRYPTİON MENU
	//	System.out.println("Enter the your p value:");
		//	p=BigInteger.valueOf(input.nextInt());
		//	System.out.println("Enter the your q value:");
		//	q=BigInteger.valueOf(input.nextInt());
		//	System.out.println("Enter the your public key value:");
		//	publicKey=BigInteger.valueOf(input.nextInt());
		//	System.out.println("Enter the your private key value:");
		//	privateKey=BigInteger.valueOf(input.nextInt());
		System.out.println("");
		//System.out.println("enter the length of your chipper text: ");
		//int arrayLength=input.nextInt();
		
		//***************Chipper Text Input************************************************
		
		
		int [] chipperInt= {9096,8153,2696,6269,3864,10683,2696,845,1106,6036,845,11730,2696,1106,1835};
		
		
		
		//***************Chipper Text Input************************************************
		BigInteger [] messageInt=new BigInteger [chipperInt.length];
		int arrayLength=chipperInt.length;
		String text ="";
		
		for(int i=0; i<=arrayLength-1; i++) {
			//System.out.printf("enter the %d. chipper object :",(i+1));
			//chipperInt[i]=input.nextInt();
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
		System.out.println("To Encryption, enter '1' \nTo Decryption enter '2' ");
		byte answer = input.nextByte();
		switch (answer) {
		case 1: 
			EncryptionMenu();
		case 2:
			DecryptionMenu();
		
		}
		
		
		
		
	}
	
	
	

	}


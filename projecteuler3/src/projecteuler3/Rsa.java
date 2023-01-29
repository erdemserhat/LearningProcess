package projecteuler3;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.*;

public class Rsa {
	public static void main(String[] args) {

		System.out.println("Welcome to RSA Algorithm...");
		KeyGenerator key = new KeyGenerator();
		System.out.println("Firstly, you need to selecet your borders to generate your keys...");
		System.out.println("Please select first border :");
		Scanner input = new Scanner(System.in);
		int border1 = input.nextInt();
		System.out.println("Please select second border :");
		int border2 = input.nextInt();
		int [] dizi = key.Genarator(border1, border2);
		for(int i =0; i<dizi.length; i++)System.out.println((i+1)+". Token :"+dizi[i]);
		System.out.println("They are the tokens that you're able to select. \nyou should select just two token by entering their number.. ");
		System.out.println("Please enter the first token's number :");
		int P = dizi[input.nextInt()-1];
		System.out.println("Please second the first token's number :");
		int Q = dizi[input.nextInt()-1];
		int PRODUCT=P*Q;
		System.out.println("Your product :" + PRODUCT);
		int TOTIENT =(P-1)*(Q-1);
		System.out.println("Your totient :" + TOTIENT);
		System.out.println("Your first key :" +P);
		System.out.println("Your first key :" +Q);
		boolean control = true;
		
		for(int i =2; i<TOTIENT; i++) {
			control = true;
			for(int k=2; k<=(i/2); k++) {
				
				if(i%k==0 || TOTIENT%i==0) control= false;
			} if(control) System.out.println("You can select ("+i+") as public key");
			
		}
		
		System.out.println("Now you can enter your public key :");
		int PublicKey= input.nextInt();
		int PrivateKey=0;
		
		while((PrivateKey*PublicKey)%TOTIENT!=1) {
			PrivateKey+=1;
			
		} System.out.println(PrivateKey+ " is your private key");
		
		
		System.out.println("Please enter the number that you want to encrypt :");
		int Message = input.nextInt();
		System.out.println("Your message :" +Message);
		double c =(Math.pow(Message, PublicKey)) % PRODUCT;
		System.out.println("Encrypted message is : " + c);
		
		BigInteger product = BigInteger.valueOf(PRODUCT);
		 
        // converting float value of c to BigInteger
        BigInteger C = BigDecimal.valueOf(c).toBigInteger();
        mE = (C.pow(PrivateKey)).mod();
        System.out.println("Decrypted message is : "
                           + msgback);

	}

}

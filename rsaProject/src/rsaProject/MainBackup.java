package rsaProject;

import java.math.BigInteger;
import java.util.Scanner;

public class MainBackup {

	/*
	 * Generating Keys... 
	 * select two prime numbers (P,Q) 
	 * calculate product of P and
	 * Q caculate totient=(P-1)*(Q-1) 
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

	static 	int p = 251;
	//First Prime Number is defined and assigned
	static 	int q = 67;
	//Second Prime Number is defined and assigned
	static 	int product = p * q; // N
	//product of p*q defined and assigned
	static 	int totient = (p - 1) * (q - 1);
	// totient value product of  (P-1)*(Q-1) is assigned
	static 	int publicKey = 29; // 
	//public key is defined and assigned.
	//pubic key must be a prime number, less than totient value and must not be a factor of totient value
	static int privateKey = 29149; // D
	//private key is defined and assigned.
	private static int PrivateKeyGenerator(int publicKey, int totient) {
		// this function return a named D value which meets the condition of (D*E)%T==1
		int privateKey = 1;
		// while loop works until ; privateKey * publicKey) % totient == 1
		while ((privateKey * publicKey) % totient != 1) {

			privateKey++;

		}
		// when , privateKey * publicKey) % totient == 1, the value of privateKey is returned.
		return privateKey;

	}

	private static BigInteger Encryption(int message) {
		// this method takes an argument named message and creates message^publicKey
		BigInteger n = new BigInteger("1");
		for (int i = 1; i <= publicKey; i++) {

			n = n.multiply(BigInteger.valueOf(message));

		}
		
		//message^publicKey is moduled with product
		BigInteger chipperText = n.mod(BigInteger.valueOf(product));
		// and (message^publicKey) mod product is returned as chipperText..
		return chipperText;

	}

	private static BigInteger Decryption(BigInteger chipperText) {
		// this function decrypt the chipper text and returned the first message
		BigInteger c = new BigInteger("1");
		for (int i = 1; i <= privateKey; i++) {
			// for loop returned the chipperText^privateKey

			c = c.multiply(chipperText);

		}

		BigInteger message = c.mod(BigInteger.valueOf(product));
		//chipperText^privateKey mod product is holded in the variable named message
		// first message is returned

		return message;
	}

	private static void Menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 to Encryption\nEnter 2 to Decryption");
		int answer = input.nextInt();
		switch (answer) {

		case 1:
			System.out.println("Please enter the message you want to encrypt");
			int message = input.nextInt();
			BigInteger chipperText = Encryption(message);
			System.out.printf("Your chipper text is  %d", chipperText);
			System.out.println();
			Menu();

		case 2:
			System.out.println("Please enter the message you want to decrypt");
			int text = input.nextInt();
			BigInteger messageText = Decryption(BigInteger.valueOf(text));
			System.out.printf("Your message is %d", messageText);
			System.out.println();
			Menu();

		}

	}

	public static void main(String[] args) {
		
		
		//Menu();
		System.out.println(PrivateKeyGenerator(publicKey,totient));
		

	}

}

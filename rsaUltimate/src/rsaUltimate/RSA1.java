package rsaUltimate;

import java.math.BigInteger;

public class RSA1 {

	public static void main(String... args) {
		BigInteger p = new BigInteger("0"); // First prime number
		BigInteger q = new BigInteger("0"); // Second prime number
		BigInteger n = new BigInteger("0"); // product
		BigInteger t = new BigInteger("0");// totient
		BigInteger e = new BigInteger("0"); // public key
		BigInteger d = new BigInteger("0"); // private key
		n = p.multiply(q);
		t = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
		PrimeNumberFinder(1, 100);

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
		System.out.println("Aralıktaki Asal Sayı Adediniz :" + sizeOfPrimes);

	}
	
	public static void PublicKeyFinder() {
		/*Coditions to be met for publicKey
		 * -Must be prime
		 * -Must be less than totient 
		 * -Must not be factor of the totient 
		 * */
		BigInteger e = new BigInteger("0");
		
		
		
		
		
		
	}

}

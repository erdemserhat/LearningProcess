package projecteuler3;

import java.math.BigInteger;

public class Decrypiton {
	
	double Decrypiton(double cipherNumber, int PrivateKey, int PRODUCT) {
		double message;
		
		message=(double)(Math.pow(cipherNumber, PrivateKey)) % PRODUCT;
	
		return message;
	}
	
	

}

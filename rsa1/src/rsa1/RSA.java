package rsa1;

import java.math.*;
import java.io.*;

public class RSA {
	public static void main(String[] args) {

		int key1 = 7;
		int key2 = 19;
		BigDecimal product = new BigDecimal(133);
		int totient = 108;
		int publicKey = 29;
		int privateKey = 41;
		int message = 60;

		BigDecimal bd = new BigDecimal(Math.pow(message, publicKey));

		System.out.println(bd);
		BigInteger bi = new BigInteger("10000000");
		BigInteger bi1 = new BigInteger("133");
		System.out.println(bi.subtract(bi1));
		
		int  result;  
		  
		//compare bigInteger big1 with big2  
		result = bi.compareTo(bi1);  
		System.out.println(result);
		while(result!=-1) {
			bi=bi.subtract(bi1);
			System.out.println(bi);
			
		} System.out.println(bi);

	}

}

package projecteuler3;
import java.math.*;
import java.math.BigInteger;

public class Encryption {
	
	public BigInteger Encryption (int Message, int PublicKey, int PRODUCT) {
	BigInteger cipherText;
	
	cipherText=(BigInteger) (Math.pow(Message, PublicKey) % PRODUCT;
	


    return cipherText;


	}
}

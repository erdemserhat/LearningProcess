package second;

import java.math.BigInteger;

public class TenthBackup {

	/*
	 * n! means n × (n − 1) × ... × 3 × 2 × 1
	 * 
	 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800, and the sum of the
	 * digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
	 * 
	 * Find the sum of the digits in the number 100!
	 */

	private static BigInteger Factor(int number) {
		var factor = new BigInteger("1");
		for (int i = 1; i <= number; i++) {

			factor = factor.multiply(BigInteger.valueOf(i));

		}
		return factor;
	}

	private static BigInteger DigitAdder(BigInteger number) {
		var summation = new BigInteger("0");
		
		while ((number.compareTo(BigInteger.ZERO)!=0)) {
			summation =summation.add(number.mod(BigInteger.TEN));
			number = number.subtract(number.mod(BigInteger.TEN)).divide(BigInteger.TEN);
			

		}
		return summation;
	}

	public static void main(String... args) {
		System.out.println(DigitAdder(Factor(100)));

	}

}

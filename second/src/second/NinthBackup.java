package second;

import java.math.BigInteger;
// to use BigInteger..
import java.util.Scanner;
// to use Scanner class

public class NinthBackup {

	/*
	 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	 * 
	 * Find the sum of all the primes below two million.
	 */

	// to define a prime number it is enough to examine its factors from one to its
	// square root.
	// sqrt() returns the square root of a value of type double passed to it as
	// argument.

	private static boolean IsPrime(int number) {
		// this function defines the argument taken (number) is prime or not.

		var sqrt = (int) Math.sqrt(number);
		// sqrt method is return the square root of number

		var counter = 0;
		// we defined to counter to know candidate prime number how much factors have.

		for (int i = 1; i <= sqrt; i++) {
			// with for loop, we can control every number from one to argument's square root
			// wheter they are factors of arguments or not.

			if (number % i == 0)
				// we can control each loop counter to have information about its factors.
				counter++;
			// if this statment returns true (if) counter variable will increase 1.
			// Since every number can be divided "1" we can control whether counter bigger
			// than one or not.

			if (counter > 1)
				// if counter is bigger than one this means that cantidate number has different
				// factors apart from 1.

				return false;
			// that is to say that cantidate number is not prime that's why method will
			// return false.
		}
		return true;
		// if counter is not bigger than one this means that candidate number has just
		// one factors named 1 so it's prime

	}

	private static BigInteger Summation(int size) {
		// this function takes an argument named "size" and controls every number under
		// the argument to know if it is prime or not and while doing it, IsPrime method
		// is used.
		var total = new BigInteger("-1");
		// we minus 1 from total variable because our function named IsPrime takes 1 as
		// prime numbers but in fact it is not prime number to correct and ignore this
		// we start to total variable as -1
		for (int i = 1; i <= size; i++) {
			// we can control every number smaller than "size" with the IsPrimeFunction
			if (IsPrime(i))
				// If this statment is true, i value will be added with total variable.
				total = total.add(BigInteger.valueOf(i));
			// Because of total variable's data type is BigInteger, we use the method of
			// BigInteger.valueOf(i), because we must not do process with different data
			// types.

		}

		return total;
		// at the end of the loop our funciton returns eventual total value.
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// input object is created to use features of Scanner class..
		System.out.println(
				"This algorithm finds the sum of all the primes below the number you will enter..\n Now enter the number: ");
		// an information message is sended to make user know about algorithm and enter value..
		int answer = input.nextInt();
		// value that is sended from user is holded in the answer variable
		System.out.println(Summation(answer));
		// Summation function is called with the answer of user under the syso function
	}

}

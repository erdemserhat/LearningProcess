package projecteuler2;

import java.util.Scanner;

public class ThirdProblem {
//Prime Numbers Finder 
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first border :");
		int border1 = input.nextInt();
		System.out.println("Please enter the second border :");
		int border2 = input.nextInt();
		boolean control = true;
		int sizeOfPrimeNumbers = 0;
		int j = 0;

		for (int i = border1; i <= border2; i++) {
			control = true;
			for (int k = 2; k <= (i / 2); k++) {

				if (i % k == 0)
					control = false;

			}
			if (control && i!=1)
				sizeOfPrimeNumbers += 1;

		}
		System.out.println(sizeOfPrimeNumbers);

		int[] primeNumbers = new int[sizeOfPrimeNumbers];

		for (int i = border1; i <= border2; i++) {
			control = true;
			for (int k = 2; k <= (i / 2); k++) {

				if (i % k == 0)
					control = false;

			}

			if (control && i!=1) {
				primeNumbers[j] = i;
				j += 1;
			}

		}

		for (int i = 0; i < primeNumbers.length; i++) {

			System.out.println((i + 1) + " . Prime Number: " + primeNumbers[i]);

		}

	}

}

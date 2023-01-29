package homeworkForPrimeNumbers;
import java.util.Scanner;

public class PrimeDivisorFinder {
	// this is a main method that is able to initialize Java Program
	public static void main(String[] args) {
	// I gave some information about the program
		System.out.println("Hello this algorithm finds the prime divisors of your number");
		System.out.println("Please enter the number which you want to see its prime divisors");
		// this is a Scanner method, it can take value from user. Scanner method is declared here.
		Scanner reader = new Scanner(System.in);
		//numberFromUser is and declared as integer and assigned as next input that comes from user
		int numberFromUser =reader.nextInt();
		//this is String variable's task is, keeping the prime divisors that is found by for loop
		String divisors="your number's prime divisors are ";
		//for loop is defined, it is started from 2 cause, 1 causes endless loop. additionally, it's not a prime number
		int i =2;
		while(numberFromUser>1) {
			// "if loop" defines the number that is able to divide numberFromUser, if  "i variable" divides numberFromUser,
			// the variable is saved and the loop is started again, but if "i variable" doesn't divide numberFromUser
			// i is assigned as i+1 and loop is started again for i+1
			if(numberFromUser%i==0) {
			divisors=divisors+","+i;
			numberFromUser=numberFromUser/i;
		
			} else i++;
		}
		// Eventually, all of the prime divisors that are able to divide numberFromUser are showed to command line
		System.out.println(divisors);
		
	}

}

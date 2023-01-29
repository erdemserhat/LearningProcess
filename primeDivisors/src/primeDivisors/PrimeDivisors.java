package primeDivisors;
import java.util.Scanner;
public class PrimeDivisors {
	public static void main(String[] args) {
		
		int input;
		System.out.println("you can enter then number which you want to see its divisors :");
		Scanner reader = new Scanner(System.in);
		int numberFromUser=reader.nextInt();
		int numberOfDivisors=0;
		String divisors="here you are  ";
		
		for(int i=1; i<=numberFromUser/2; i=i+1) {
			
			if(numberFromUser%i==0) {
				numberOfDivisors++;
				divisors=divisors+i+",";		
				}
			
			
			}
		System.out.println(divisors+numberFromUser);
		}
		
		
	}



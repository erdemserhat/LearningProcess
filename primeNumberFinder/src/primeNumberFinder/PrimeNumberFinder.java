package primeNumberFinder;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class PrimeNumberFinder {
	
	public static void main(String[] args) {
		
		//Scanner reader= new Scanner(System.in);
		
		//i1nt numberFromUser=reader.nextInt();
		
		Random rnd = new Random();
		int numberFromUser=rnd.nextInt(10);
		System.out.println(numberFromUser+" primitive numbers were found by computer");
		
		int totalPrimeNumber=0;
		
		String primeNumber="here you are ";
		
		int primeControl=0;
		
		for(int i =2; numberFromUser>totalPrimeNumber; i++)
		{
			
		if(i==2)
		{
			totalPrimeNumber++;
			primeNumber=primeNumber + "," + i;
			
		}else {
			primeControl=0;
			for(int j=2; j<i; j++) {
				
				if(i%j==0)  {
					primeControl=1;
					break;
							}
						}
				
			if(primeControl==0) {
				totalPrimeNumber++;
				primeNumber=primeNumber + "," + i;
					}	
			
				}
			}
		System.out.println(primeNumber);	
	}
			
}



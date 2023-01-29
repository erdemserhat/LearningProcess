package asalSayiTesbit;
import java.util.Scanner;

public class AsalSayiClass {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter the number that you want to control");
		int numberfromuser=reader.nextInt();
		int controlVariable=0;
		
		if(numberfromuser==2) {
			controlVariable=0;
			
			
		}else if(numberfromuser==1) {
			controlVariable=1;
		
		}else {
		
			
			for(int i =2; i<numberfromuser; i++) {
				
				
				
				if(numberfromuser%i==0) {
					controlVariable=1;
					break;
				}
								
				
				}
			
			
		 
		
	
	}
		
		
		if(controlVariable==0) {
			
			System.out.println("the number is prime");
		}else {
			System.out.println("the number is not prime");
		}
				
	}

}

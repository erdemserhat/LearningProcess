package calculator;
import java.util.Scanner;


public class Calculator { 
	
	public static void main(String [] args){
		System.out.println("Welcome to My Calculator");
		Scanner reader= new Scanner(System.in);
		System.out.println("Please enter the process name you want ;");
		System.out.println("multiplication=1");
		System.out.println("division=2");
		System.out.println("subtraction=3");
		System.out.println("addition=4");
		String processName = reader.next();
		System.out.println("enter the first number which you want to make process with second number");
		double numberReceivedFromUser = reader.nextInt();
		double numberReceivedFromUser2 = reader.nextInt();
		Calculate calculate = new Calculate();
		switch(processName) {
		
		case 	"1":
			System.out.println(calculate.multiply(numberReceivedFromUser, numberReceivedFromUser2));
			
			break;
		
		case	"2":
			System.out.println(calculate.divide(numberReceivedFromUser, numberReceivedFromUser2));
			break;
		case	"3" :
			System.out.println(calculate.minus(numberReceivedFromUser, numberReceivedFromUser2));
			break;
		case	"4":
			
			System.out.println(calculate.plus(numberReceivedFromUser, numberReceivedFromUser2));
		break;
		
		
		}
		
		}
		
	}



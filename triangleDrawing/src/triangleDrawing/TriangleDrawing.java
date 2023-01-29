package triangleDrawing;
import java.util.Scanner;

public class TriangleDrawing {
	
	public static void main (String[] args) {
		
		System.out.println("POWERRED BY SERHAT ERDEM");
		System.out.println("Which type of triangle do you want to drive");
		System.out.println("type1=1");
		System.out.println("type2=2");
		System.out.println("type3=3");
		System.out.println("type4=4");
		System.out.println("write your answer");
		System.out.println("Waiting...");
		// input is taken from user
		Scanner reader = new Scanner(System.in);
		// input that is taken from user is assigned to answer variable
		String answer = reader.next();
		
		// a switch case is defined to do process, according to answer.
		switch(answer) {
		
		//when user enters "type1", the following codes will work.
		case "1":
			// an object from the related class is defined.
			FirstShapeTriangle firstType = new FirstShapeTriangle();
			//work method from related class is called with the help of the object.
			firstType.work();
			
			//break method is defined to make  the loop stop.
			break;
			//when user enters "type2", the following codes will work.
		case "2":
			// an object from the related class is defined.
			SecondShapeTriangle secondType = new SecondShapeTriangle();
			//work method from related class is called with the help of the object.
			secondType.work1();
			//break method is defined to make  the loop stop.
			break;
		//when user enters "type3", the following codes will work.	
		case "3":
			// an object from the related class is defined.
			ThirdTypeTriangle thirdType = new ThirdTypeTriangle();
			//work method from related class is called with the help of the object.
			thirdType.work();
			//break method is defined to make  the loop stop.
			break;
			//when user enters "type4", the following codes will work.	
		case "4":
			// an object from the related class is defined.
		PairTriangle pairType = new PairTriangle();
			//work method from related class is called with the help of the object.
			pairType.work();
			//break method is defined to make  the loop stop.
			break;
		}
		
		
		}
		
		;
		
			
		
		
			
		
		
		
	}
		
		
	
	



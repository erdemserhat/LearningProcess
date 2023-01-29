package triangleDrawing;
import java.util.Scanner;

public class SecondShapeTriangle {
	
	static void work1() {
		System.out.println("enter a number for second shape traingle");
		Scanner reader = new Scanner(System.in);
		int numberFromUser = reader.nextInt();
		String stars= "";
		
	for(int meter= numberFromUser; 1<=meter; meter=meter-1)	{
		
		for(int meter2=1; meter2<=meter; meter2++){
			stars=stars+" "+"*";
		}
		
		System.out.println(stars);
		stars="";
		}
		
		
	} 

}

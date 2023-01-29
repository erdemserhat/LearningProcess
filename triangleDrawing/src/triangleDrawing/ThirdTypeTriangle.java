package triangleDrawing;
import java.util.Scanner;

public class ThirdTypeTriangle {
	
	
	static void work() {
	System.out.println("please enter the high value of your triangle");
	Scanner reader = new Scanner(System.in)	;
	int base = reader.nextInt();
	String spaces="";
	String stars="";
	for(int meter=1; meter<=base; meter++) {
		spaces ="";
		stars="";
	// leave space
	for(int meter2=1; meter2<=3*base-meter; meter2++){
		
		spaces=spaces+" ";
	
	}
	// leave stars
	for(int meter3=1; meter3<=meter; meter3++) { stars=stars+ "*" +" " ;}
	System.out.println(spaces+stars);
	}
	
	
	
	
	
	
	
	
	}

	
}
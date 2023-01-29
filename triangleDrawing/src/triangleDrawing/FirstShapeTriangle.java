// this is a package name
package triangleDrawing; 
//Scanner tool is imported to take value from the user
import java.util.Scanner;
// a class defined to define a method
 class FirstShapeTriangle {
// a method which doesn't return a value is defined by using void
static void work() {
	// an information text is showed to make user inform 
	System.out.println("enter the height of the triangle");
	//Scanner method is assigned.
	Scanner reader = new Scanner(System.in);
	// taken value is assigned as n
	int numberFromUser = reader.nextInt();
	//A string variable is defined to show stars.
	String stars="";
	// meter will start from 1 to numberFromUser by increasing 1
	//so for loop is going to work (numberFromUser) times 
		for(int meter =1; meter<=numberFromUser; meter++) {
			// * for first loop
			// * * for second loop
			// * * * for third loop.
			// * * * * for fourth loop.
			// * * * * * *......... for (numberFromUser) loop
			stars=stars+" "+"*";
			System.out.println(stars);
				}
	
		}
	
}	
	
	
	
	


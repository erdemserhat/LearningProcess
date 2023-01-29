package triangleDrawing;

import java.util.Scanner;

public class PairTriangle {
	
	static void work() {
		

		System.out.println("please enter the high value of your triangle");
		Scanner reader = new Scanner(System.in)	;
		int base = reader.nextInt();
		String spaces="";
		String stars=" ";
		for(int meter1=1; meter1<=base; meter1++) {
			spaces ="";
			stars="";
		for(int meter2=1; meter2<=3*base-meter1; meter2++){
			
			spaces=spaces+"";
		
		}
		
		for(int meter3=1; meter3<=meter1*2-1; meter3++) { stars=stars+"*" ;  	}
		System.out.println(spaces+stars);
		}
	
		// here you can continue
		
		for(int meter4=base; 1<=meter4; meter4--) {
			spaces ="";
			stars="";
		for(int meter5=base-meter4; 1<=meter5; meter5--){
			
			spaces=spaces+" ";
		
		}
		
		for(int meter6=meter4*2-1; 1<=meter6; meter6--) { stars=stars+"*" ;  	}
		System.out.println(spaces+stars);
		}
		
		
	}

	
	
	
}

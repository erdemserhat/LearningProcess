package exampleMethods;
import java.util.Scanner;
import java.util.Random;

public class TryingMethods {
	
	public static void main(String[] args) {
		
		int i = 0;
		do {
		  System.out.println(i);
		  i++;
		}
		while (i <= 5);
		
		System.out.println("do-while loop is finished");
		//The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
		
		int a =1;
		while(a<=5) {
			
			System.out.println("ok" +a);
			a++;
		}
		
		Random input=new Random();
		int day =input.nextInt(7);
		System.out.println(day);
		//Using of switch statement
		switch(day) {
		
		case 1:
			System.out.println("monday");
			break;
			
		case 2 :
			System.out.println("tuesday");
		break;
		
		case 3:
			System.out.println("wendesday");
			break;
			
		case 4:
			System.out.println("thursday");
			break;
			
		case 5:
			System.out.println("friday");
			break;
			
		case 6:
			System.out.println("saturday");
			break;
		case 7 :
			System.out.println("sunday");
			break;
			 
		}
		
		//Using of continue and break
		
		
			for (int j=1; j<10; j++) {
				if(j==5) {
					
					System.out.println(j);
					;
					
		
				}
		
				System.out.println(j);
	
				}
			
		
			String myFamily[]= {"serhat","ali","volkan","tulay","gulay"};
			
			for(int s =0; s<5; s++) {
				
				System.out.println(myFamily[s]);
				
			}
			System.out.println(myFamily.length);
			
			for(String g :myFamily) {
				System.out.println(g);
			}
			
			
			//Multidimensional Arrays
			
			int sampleArray[][]= {{1,2,3,4,5,6},{7,8,9,10,11}};
			//System.out.println(sampleArray[1][0]);
			//System.out.println(sampleArray.length);
			//System.out.println(sampleArray[0].length);
			//System.out.println(sampleArray[1].length);
			
			for(int z=0; z<sampleArray.length; z++) {
				
				for(int c=0; c<sampleArray[z].length; c++) {
					System.out.println(sampleArray[z][c]);
				}
				
				
			}
			
			
			
			
			
			
			
			
			
			
		
		
		}
		
		
		
	}


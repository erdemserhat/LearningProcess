package exampleJavaProject;

import java.util.Scanner;

public class ExampleClass {

	public static void main(String[] args) {
		

Scanner reader = new Scanner(System.in);
        
        System.out.print("Maasizi Girin: ");
				
		
int brutMaas= reader.nextInt();
double netMaas;
double vergi;

if(brutMaas>=10000) {
	
	vergi=(brutMaas*0.25);
	netMaas=brutMaas-vergi;
	
}else if(brutMaas>=5000) {
	
	vergi=(brutMaas*0.20);
	netMaas=brutMaas-vergi;
	
}else {
	
	vergi=(brutMaas*0.15);
	netMaas=brutMaas-vergi;
}

System.out.println(netMaas);
	}

}

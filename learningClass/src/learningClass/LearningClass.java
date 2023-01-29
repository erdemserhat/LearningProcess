package learningClass;

public class LearningClass {
	
	
	static int exampleRecurisonFunction(int n) {
		if(n>0) {
			return n + exampleRecurisonFunction(n-1);
		}else return 0;
		
	}
	
	static void calculateFactorial(int numberforfactorial, int numberforsquare) {
		int factorial=1;
		for(int i=1; i<=numberforfactorial; i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
		System.out.println(numberforsquare*numberforsquare);
		
	}
	
	static int exampleFunction(int x) {
		return x+1;
		
		
	}
	
	static int exampleFunctionPlus(int a, int b) {
		
		return a+b;
	}
	
	static int theSameFunction (int q) {
		return q*2;
	}
	
	static int theSameFunction (int q, int w) {
		return q*w;
	}
	
	static String theSameFunction(double q) {
		String k="hello"+q;
		return k;
	}
	
	
	
	public static void main (String[] args) {
		
		System.out.println(exampleFunction(1));
		System.out.println(exampleFunctionPlus(10,20));
		System.out.println(theSameFunction(2.0));
		System.out.println(exampleRecurisonFunction(10));
	}
	
	

	
	
	}
	
	



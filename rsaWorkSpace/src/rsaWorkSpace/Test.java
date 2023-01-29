package rsaWorkSpace;

public abstract class Test {
	
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		String text ="";
		for(int i=0; i<100000; i++) {
			if(i==0) text=text+i;
			else text+=","+i;
			
			
		}
		
		
		System.out.println(text);
		
		long endTime=System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}

}

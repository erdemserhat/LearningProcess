package rsaWorkSpace;

public class Test_Class {
	public static void main(String[] args) {
		
		String [] chipperBinary= {"11001010110000011","11110100110110100","11011111010100","1000100010100100001","1000010010000011110","1001000011001001111","110010001011001101","11110100110110100","11011111010100","10111101010101101","11110100110110100","11001010110000011","110010001011001101","1000101011001101110","11110100110110100","11011111010100","1000100010100100001","1000010010000011110","1001000011001001111","110010001011001101","11110100110110100","11011111010100","10111101010101101","11110100110110100","11001010110000011"};
System.out.println(chipperBinary.length);
		
		

	}

	public static String DecimalToBinary(int decimal) {

		String binaryNumberHolder = "";
		int modula;
		while (decimal != 0) {
			modula = decimal % 2;
			binaryNumberHolder = String.valueOf(modula) + binaryNumberHolder;
			decimal = decimal / 2;

		}
		return binaryNumberHolder;

	}
	
	
}
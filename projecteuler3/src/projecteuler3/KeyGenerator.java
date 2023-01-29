package projecteuler3;

public class KeyGenerator {
	int sizeOfKeys = 0;
	boolean control = true;
	int k=0;
	int flag;

	public int[] Genarator(int border1, int border2) {

		for (int border = border1; border <= border2; border++) {
			control = true;
			for (int i = 2; i <= (border / 2); i++) {

				if (border % i == 0) {
					control = false;
				}
			}
			if (control) {
				sizeOfKeys += 1;

			}
			



		}
		int primeNumbers[] = new int[sizeOfKeys];
		for (int border = border1; border <= border2; border++) {
			control = true;
			for (int i = 2; i <= (border / 2); i++) {

				if (border % i == 0) {
					control = false;
				}
			}
			if (control) {
				
					primeNumbers[k] = border;
					k+=1;

				}

			}
		
		return primeNumbers;
		
		
			
		}
		}
	
		
		

	

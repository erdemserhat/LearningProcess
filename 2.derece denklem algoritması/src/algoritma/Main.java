package algoritma;


import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println("2.Dereceden denklemizin rastgele olarak oluşturulması için 1, kendiniz oluşturmak için 2, giriniz");
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		byte choice = input.nextByte();
		switch(choice) {
		
		case 1:

			System.out.println("ax^2 +bx +c şeklindeki denkleminizin katsayilari maks kaç olsun ?");
			int maxDeger =input.nextInt();
			int a = (int)random.nextInt(maxDeger+1);
			int b = (int)random.nextInt(maxDeger +1);
			int c = (int)random.nextInt(maxDeger +1);
			System.out.println(a+ "x^2 + " +b +"x + " + c +" için");
			double delta = (Math.pow(b, 2))-(4*a*c);
			
			if(delta>0) {
				System.out.println("Random olarak oluşturulan Denkleminizin 2 kökü var");
			double x1 = (-b +Math.sqrt(delta))/2*a;
			double x2 = (-b -Math.pow(delta,0.5))/2*a;
			double koklerToplami =x1+x2;
			System.out.println("birinci kok :" +x1 + "ikinci kok: " + x2);
			System.out.println("kokler toplami: " +koklerToplami);
			} else if (delta==0) {
				System.out.println("random olarak oluşturulan denkleminizin 2 eşit reel koku var");
				double x1= (-b + Math.pow(delta, 0.5))/(2*a);
				double koklerToplami =-b/a;
				System.out.println("birinci kök ikinci köke eşit olup kökler " +koklerToplami +"dir");
			}else if (delta<0)
					System.out.println("reel kok yok");
			break;
			
		case 2:
			System.out.println("ax^2 teriminin a katsayisini giriniz");
			int a1 = input.nextInt();
			System.out.println("bx teriminin b katsayisini giriniz");
			int b1 = input.nextInt();
			System.out.println("c sabit terimini giriniz");
			int c1 = input.nextInt();
			System.out.println(a1+ "x^2 + " +b1 +"x + " + c1 +" için");
			double delta1 = (Math.pow(b1, 2))-(4*a1*c1);
			if(delta1>0) {
				System.out.println("Random olarak oluşturulan Denkleminizin 2 kökü var");
			double x3 = (-b1 +Math.sqrt(delta1))/2*a1;
			double x4 = (-b1 -Math.pow(delta1,0.5))/2*a1;
			double koklerToplami =x3+x4;
			System.out.println("birinci kok :" +x3 + "ikinci kok: " + x4);
			System.out.println("kokler toplami: " +koklerToplami);
			} else if (delta1==0) {
				System.out.println("random olarak oluşturulan denkleminizin 2 eşit reel koku var");
				double x1= (-b1 + Math.pow(delta1, 0.5))/(2*a1);
				double koklerToplami =-b1/a1;
				System.out.println("birinci kök ikinci köke eşit olup kökler " +koklerToplami +"dir");
			}else if (delta1<0)
					System.out.println("reel kok yok");
			break;
		
		}
		
	
			
		}
	
	}

						


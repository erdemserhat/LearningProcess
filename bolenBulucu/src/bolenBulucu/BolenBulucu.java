package bolenBulucu;
import java.util.Scanner;

public class BolenBulucu {
	
	public static void main(String[] args) {
		
		
		Scanner reader= new Scanner(System.in);
		System.out.println("Bolenlerini  bulmak istediginiz sayiyi giriniz");
		int sayi=reader.nextInt();
		String bolenler ="Sayinizi bolen tam sayilar";
		
		for(int i = 1 ; i<=sayi/2 ; i=i+1) {
			
			if(sayi%i==0) {
				bolenler=bolenler +","+i;
			}
			
		}
		
		bolenler=bolenler+","+sayi;
		System.out.println(bolenler);
			
			
		}
		
		
		
		
	}
	



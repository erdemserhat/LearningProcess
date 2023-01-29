package javatutorial;

public class Driver {
	
public static void main(String[] args) {
	
	//8 temel veri tipi üzerinde çalışılacak
	
	byte myByteVariable = -120 ;
	// bu veri tipi -127 ile +128 arasındaki değerleridepoa edebilir integral type'ler arasında yer alır
	
	short myShortVariable = 30000;
	// bu veri tipi 16 bitten olusur 2 byte'dir 30000 artı eksi aralıklarındakı degerler depa eder
	
	int myIntVariable= 10000000; 
	//bu 4 byteden olusur 32 bittir genel reel sayılardan olusur diyebiliriz sınırı vardır
	
	long myLongVariable = 1203026131;
	// integral type'baslıgı adı altındaki en kapsamlı veri tipidir 64 bitten olusur 4 byte'dir
	
	float myFloatVariable = 1.212f;
	/*floating-point numbers baslıgı altındaki ilk veri tipi float'tır decimal sayıları icerir
	javada varsayılan decimal sayı veri turu double'dir bu yüzden başlangıc degerinin sonuna
	f (float) getirerek bu degerin float oldugunu bildiriyoruz
	
	*/
	
	double myDoubleVariable=12.433;
	//burda gorudugunuz gibi varsayılan veri tipş double oldugundan d'yi eklemek opsiyoneldir.
	//double veri tipi float'tan daha hassas olarak depolama işlemi gercekleştirir.
	
	
	boolean myBooleanVariable=true;
	// boolean veri tipi true yada false gibi mantıksal degerler alır.
	
	//Mini Proje
	
	byte vizeNotu ;
	byte finalNotu;
	double ortalama;
	
	vizeNotu=0;
	finalNotu=50;
	ortalama=0;
	
	ortalama=(vizeNotu+finalNotu)/2;
	
	System.out.println(ortalama);
	
	if(ortalama>=50) {
		
		System.out.println("Tebriker "+ortalama + " ile gectiniz" );
	} else {
		
		System.out.println("uzgunuz " +ortalama + " ile kaldiniz");
	}
	
	
	/*değişkenler aynı satırda hem tanımlanıp hem atanabilirler yada tek satırdan tanımlanıp 
	sonraki satırda atamaları yapılabilir.*/
	
	
	
	final int exampleVariable = 12;
	
	float pi =3.14f;
	
	
	double exampleVariable34 =-2.32323232323;
	System.out.println(exampleVariable34);
	
	
	char exampleCharVariable ='a';
	System.out.println(exampleCharVariable);	
	

	String a = new String();
	
	
	//karakter dizisinden elemanları birleştirme
	
	char chards[] = {'a','b','c'};
	String s = new String(chards);
    System.out.println(s);
    
    // bir karakter dizisinin belli elemanlarını bir string degiskenine atamak
    
    char chars[] = {'a','b','c','d'};
    
    //String Yapıcılar
    
    String newString=new String();
    newString="example";
    System.out.println(newString);
    
    
    char[] exampleArray = {'1','2','3','4'};
    String exampleString = new String(exampleArray);
    System.out.println(exampleString);
    
    
    char newCharType[] = {'a','b','c','d','e'};
    String newCharTypeStringExample=new String(newCharType,0,2);
    System.out.println(newCharTypeStringExample);
    
    System.out.println(newCharTypeStringExample.length());
    
    String benimAdim=new String("Serhat");
    System.out.println(benimAdim.length());
    
    //String Birleştirmek
    
    String yas ="12";
    String sw=new String("Ali " + yas + " yasindadir");  //birleştirme işlemi artı operatoru ile yapıldı
    System.out.println(sw);
   

	
    
 Integer exampleInt = 6 ;
 System.out.println(exampleInt.toString());
 System.out.println(Integer.toString(12));
 
String example34 =new String("serhat");
System.out.println(example34.toString());
 

System.out.println(Double.toString(12.0));

String abcd =new String("12345");
System.out.println(abcd.charAt(0));
System.out.println(abcd.charAt(4));


String example354=new String("SERHAT ERDEM");

char ch[]=new char[12];

example354.getChars(0, 6, ch, 0);
System.out.println(ch);



    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
	
}



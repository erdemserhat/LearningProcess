package socialmedia;

import java.util.Scanner;

public class Main {
	
	public static void main (String [] args) {
	Scanner reader = new Scanner(System.in);
	User user = new User();
	System.out.println("enter your name");
	user.name=reader.next();
	System.out.println("enter your age");
	user.age=reader.nextInt();
	System.out.println("enter your email");
	user.email=reader.next();
	System.out.println("enter your password");
	user.password=reader.next();
	User user2 = new User("serhat", 12,"serhaterdem@gmail.com","3451");
	User user3 = new User("erdem", 14,"erdem@gmail.com","3451");
	System.out.println(user2.age);
	System.out.println(user3.age);
	}

}

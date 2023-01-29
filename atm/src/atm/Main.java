package atm;

import java.util.Scanner;

public class Main {
	static Costumer costumer = new Costumer();
	
	static Scanner input = new Scanner(System.in);

	static void LoginOrRegister() {
		System.out.println("");
		System.out.println("Please enter the your situation..");
		System.out.println("Enter 1 to Register Java-Bank");
		System.out.println("Enter 2 to Login JavaBank (If you have registered before select this)");
		Scanner input = new Scanner(System.in);
		byte answer = input.nextByte();
		int costumerSituation = answer;
		switch (answer) {
		case 1:
			Register();
		case 2:
			Login();
			System.out.println();

		}

	}

	static void WelcomeMenu() throws InterruptedException {
		char welcomeLetters[] = { 'W', 'E', 'L', 'C', 'O', 'M', 'E', ' ', 'T', 'O', ' ', 'J', 'A', 'V', 'A', '-', 'B',
				'A', 'N', 'K' };
		for (int i = 0; i < welcomeLetters.length; i++) {
			System.out.print(welcomeLetters[i]);
			Thread.sleep(10);
		}
		LoginOrRegister();

	}

	static void Register() {
		System.out.println("You are going to register Java-Bank, In this section, we need some information about you");
		System.out.println("Please enter the your first name :");
		costumer.name = input.next();
		System.out.println("Please enter the your surname :");

		costumer.surname = input.next();
		System.out.println("Are you male or female ? Enter as F/M");
		costumer.sex = input.next();
		System.out.println("Please enter the your age :");

		costumer.age = input.nextInt();
		System.out.println("Please enter the your phone number :");
		costumer.phoneNumber = input.nextLong();
		costumer.id = (int) (costumer.phoneNumber / 2022) * costumer.age;
		System.out.println("Your id is defined as " + costumer.id + " So, you can use this id to Login");
		System.out.println(
				"Let's make this section finish by defining your password, you should create a strong password...");
		System.out.println("Define the your password :");
		costumer.password = input.next();
		System.out.println("You have successfully registered to JavaBank, Let's come back to Menu");

		System.out.println("How much money do you have ?");
		costumer.totalMoney = input.nextLong();
		LoginOrRegister();

	}

	static void Login() {

		System.out.println("Please enter the your Costumer ID :");
		int controlId = input.nextInt();
		System.out.println("Please enter the your Password :");
		String controlPassowrd = input.next();
		if (controlId == costumer.id && controlPassowrd.equals(costumer.password)) {
			System.out.println("You have successfully logged in..");
			MainMenu();
		} else {
			System.out.println("Costumer ID or Password was wrong, try again..");
			System.out.println("");
			Login();

		}

	}

	static void MainMenu() {
		System.out.println("Dear, " + costumer.name.toUpperCase() + " " + costumer.surname.toUpperCase());
		System.out.println("");
		System.out.println("Total Money : " + costumer.totalMoney);
		System.out.println("Phone Number :" + costumer.phoneNumber);
		System.out.println((costumer.sex.equals("F")) ? "Costumer's Gender : Female" : "Costumer's Gender : Male");
		System.out.println("Costumer's ID :" + costumer.id);
		System.out.println("Enter 1 to Deposit Money");
		System.out.println("Enter 2 to WithDraw Money");
		System.out.println("Enter 3 to Change Password");
		System.out.println("Enter 4 to Log out");

		byte process = input.nextByte();
		switch (process) {
		case 1:
			DepositMoney();
			break;
		case 2:
			WithDrawMoney();
			break;
		case 3:
			ChangePassword();
			break;
		case 4:
			LoginOrRegister();

		}

	}

	static void ChangePassword() {
		System.out.println("Please enter the your current password :");
		String currentPassword = input.next();
		System.out.println("Please enter the your new password you want to change :");
		String newPassWord = input.next();
		if (currentPassword.equals(costumer.password)) {
			costumer.password = newPassWord;
			System.out.println("Your password has been successfully changed.");
			System.out.println("You need to Login again with your new password...");
			Login();
		} else {
			System.out.println("your current password and password you have entered don't match, try again");
			ChangePassword();
		}
	}

	static void DepositMoney() {
		System.out.println("How much money are you going to deposit ?");
		long amountOfDepositMoney = input.nextLong();
		costumer.totalMoney += amountOfDepositMoney;
		System.out.println("you have successfully deposited the money...");
		MainMenu();

	}

	static void WithDrawMoney() {
		System.out.println("How much money are you going to withdraw ?");
		long amountOfWithDraw = input.nextLong();
		costumer.totalMoney -= amountOfWithDraw;
		System.out.println("you have successfully withdrawed the money...");
		MainMenu();

	}

	public static void main(String[] args) throws InterruptedException {
		WelcomeMenu();

	}

}

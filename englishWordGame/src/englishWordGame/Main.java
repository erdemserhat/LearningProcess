package englishWordGame;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		char welcomeMessage[] = { 'W', 'E', 'L', 'C', 'O', 'M', 'E', ' ', 'T', 'O', ' ', 'J', 'A', 'V', 'A', ' ', 'W',
				'O', 'R', 'D', ' ', 'B', 'O', 'O', 'S', 'T', 'E', 'R' };
		for (int i = 0; 27 >= i; i++) {
			System.out.print(welcomeMessage[i]);
			Thread.sleep(10);
		}

		System.out.println("");
		char nickName[] = { 'L', 'E', 'T', 'S', ' ', 'D', 'E', 'F', 'I', 'N', 'E', ' ', 'A', ' ', 'N', 'I', 'C', 'K',
				' ', 'N', 'A', 'M', 'E' };
		for (int i = 0; 22 >= i; i++) {
			System.out.print(nickName[i]);
			Thread.sleep(10);
		}

		Scanner nickNameGetter = new Scanner(System.in);
		User player = new User();
		player.nickName = nickNameGetter.next();
		System.out.println("Your nick name is set as " + "'" + player.nickName + "'");
		System.out.println(" WARNING : PLEASE DON'T USE THE TURKISH CHARACTERS");
		Questioner questioner = new Questioner();
		questioner.questioner();

	}

}

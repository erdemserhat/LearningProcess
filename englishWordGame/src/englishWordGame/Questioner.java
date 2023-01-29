package englishWordGame;

import java.util.Random;
import java.util.Scanner;

public class Questioner {
	static User player = new User();

	static void questioner() {

		// The list below is word list which will be asked to User
		Word word1 = new Word("hello", "merhaba");
		Question question1 = new Question("What's the Turkish meaning of ", word1);
		Word word2 = new Word("say", "soylemek");
		Question question2 = new Question("What's the Turkish meaning of ", word2);
		Word word3 = new Word("play", "oynamak");
		Question question3 = new Question("What's the Turkish meaning of ", word3);
		Word word4 = new Word("run", "kosmak");
		Question question4 = new Question("What's the Turkish meaning of ", word4);
		Word word5 = new Word("drink", "içmek");
		Question question5 = new Question("What's the Turkish meaning of ", word5);
		Word word6 = new Word("sleep", "uyumak");
		Question question6 = new Question("What's the Turkish meaning of ", word6);
		Word word7 = new Word("exception", "istisna");
		Question question7 = new Question("What's the Turkish meaning of ", word7);
		Word word8 = new Word("call", "aramak");
		Question question8 = new Question("What's the Turkish meaning of ", word8);
		Word word9 = new Word("dark", "karanalik");
		Question question9 = new Question("What's the Turkish meaning of ", word9);
		Word word10 = new Word("screen", "ekran");
		Question question10 = new Question("What's the Turkish meaning of ", word10);
		Word word11 = new Word("woman", "kadin");
		Question question11 = new Question("What's the Turkish meaning of ", word11);
		Word word12 = new Word("catch", "yakalamak");
		Question question12 = new Question("What's the Turkish meaning of ", word12);
		Word word13 = new Word("wake up", "uyanmak");
		Question question13 = new Question("What's the Turkish meaning of ", word13);
		
		Question questionArray[] = { question1, question2, question3, question4, question5, question6, question6,
				question7, question8, question9, question10, question11, question12, question13 };
		Word wordArray[] = { word1, word2, word3, word4, word5, word6, word7, word8, word9, word10, word11, word12,
				word13, };

		System.out.println("");

		for (int n = 0; questionArray.length - 1 > n; n++) {
			Question randomQuestion = questionArray[n];
			Word randomWord = wordArray[n];

			System.out.println(player.point);

			System.out.println(randomQuestion.explanation + randomWord.enMeaning + " ? "); // Question ?
			Scanner answerGetter = new Scanner(System.in); // Getting Answer ?
			String answer = answerGetter.next(); // answer is taken.
			if (answer.equalsIgnoreCase(randomWord.trMeaning)) {
				System.out.println("Congrulations !");
				randomWord.point = randomWord.point + 50;
				player.point = player.point + 100;
				System.out.println("You won 100 points.");
				System.out.println("Total point is " + player.point);

			} else {
				System.out.println("Try Again :( ");

			}

		}

		// Random randomer = new Random();
		// int n = randomer.nextInt(questionArray.length);

	}

}

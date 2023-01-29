package vize;
import java.util.Random;
import java.util.Scanner;

public class Game {
public static void main (String[] args) {
System.out.println("Welcome to Game called Scissors, stone and paper. ");
System.out.println("enter 0 for stone, enter 1 for paper, enter 2 for scissors");
try (Scanner reader = new Scanner(System.in)) {
	int answerOfUser = reader.nextInt();
	System.out.println("please enter a right number");
	Random random = new Random();
	int answerOfComputer = random.nextInt(2);
	System.out.println(answerOfComputer);
	if(answerOfComputer==0 && answerOfUser==0) {
	System.out.println("draw ");
	}else if(answerOfComputer==0 && answerOfUser==1) {
	System.out.println("you lost ");
	}else if(answerOfComputer==0 && answerOfUser==2) {
	System.out.println("you lost ");
	}else if(answerOfComputer==1 && answerOfUser==0) {
	System.out.println("you lost ");
	}else if(answerOfComputer==1 && answerOfUser==1) {
	System.out.println("draw ");
	}else if(answerOfComputer==1 && answerOfUser==2) {
	System.out.println("you won ");
	}else if(answerOfComputer==2 && answerOfUser==0) {
	System.out.println("you won ");
	}else if(answerOfComputer==2 && answerOfUser==1) {
	System.out.println("you lost ");
	}else if(answerOfComputer==2 && answerOfUser==2) {
	System.out.println("draw ");
	}
}
}

}
	



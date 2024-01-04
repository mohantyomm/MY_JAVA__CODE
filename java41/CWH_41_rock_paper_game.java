package com.omm.java41;
import java.util.Random;
import java.util.Scanner;
 

public class CWH_41_rock_paper_game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int your_choice;
		System.out.println("Enter 1 for rock 2 for Scissor 3 for paper ");
		your_choice = sc.nextInt();
		Random random = new Random();
		int computer_choice;
		computer_choice = random.nextInt(3);
		if (your_choice == computer_choice) {
			System.out.println("Draw");
		} else if (your_choice == 1 && computer_choice == 2 || your_choice == 2 && computer_choice == 3
				|| your_choice == 3 && computer_choice == 1) {
			System.out.println("You win");
		} else {
			System.out.println("computer win");
		}
		sc.close();
	}
}
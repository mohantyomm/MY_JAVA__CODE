package com.omm.java50;

import java.util.Scanner;
import java.util.Random;

public class CWH_50_NUMBER_GUESS {
	public static void main(String[] args) {
		int your_choice;
		int System_choice;
		Scanner sc= new Scanner(System.in);
		Random rn = new Random();
		System.out.println("The number is lie between 1 to 100");
		System_choice=rn.nextInt(100);
		for(int i=0;i<System_choice;i++)
		{
			System.out.println("Enter your guess");
			your_choice=sc.nextInt();
			
			if(your_choice==System_choice)
			{
				System.out.println("You guessed correct in "+(i+1)+"th try");
				break;
			}
			else if(your_choice>System_choice)
			{
				System.out.println("Enter some lower number");
				continue;
			}
			else if(your_choice<System_choice);
			{
				System.out.println("Enter higher number");
				continue;
			}
			 
		}
		sc.close();
 	}
}

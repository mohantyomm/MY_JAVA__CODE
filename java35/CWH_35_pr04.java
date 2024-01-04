package com.omm.java35;

import java.util.Scanner;

public class CWH_35_pr04 {
	static void printpattern(int x) {
		for (int i = x; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter the value of x");
		x = sc.nextInt();
		printpattern(x);
		sc.close();
	}
}

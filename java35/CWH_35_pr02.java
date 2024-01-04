package com.omm.java35;

import java.util.Scanner;

public class CWH_35_pr02 {
	void printpattern(int x) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the num");
		num = sc.nextInt();
		CWH_35_pr02 obj = new CWH_35_pr02();
		obj.printpattern(num);
		sc.close();
	}
}

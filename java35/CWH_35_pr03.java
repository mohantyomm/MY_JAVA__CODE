package com.omm.java35;

import java.util.Scanner;

public class CWH_35_pr03 {
	static int Sum(int x) {
		if (x == 1) {
			return 1;
		}

		return x + Sum(x - 1);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		num = sc.nextInt();
		int result = Sum(num);
		System.out.println("sum of first " + num + " natural number is =" + result);
		sc.close();
	}
}

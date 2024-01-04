package com.omm.java34;

import java.util.Scanner;

public class CWH_34_recursion {
	static int fibonacci(int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		} else {
			return fibonacci(x - 1) + fibonacci(x - 2);
		}
	}

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x : ");
		x = sc.nextInt();
		for (int i = 0; i <= x; i++) {
			int z = fibonacci(i);
			System.out.println(z);
		}
		sc.close();
	}

}

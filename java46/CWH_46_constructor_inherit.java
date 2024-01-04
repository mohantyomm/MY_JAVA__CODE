package com.omm.java46;

class Armstrong {
	Armstrong() {
		int num = 153;
		int result = 0, remainder, initial;
		initial = num;
		while (num > 0) {
			remainder = num % 10;
			result += Math.pow(remainder, 3);
			num = num / 10;
		}
		if (initial == result) {
			System.out.println("The number is Armstrong");
		} else {
			System.out.println("Entered number is nnot Armstrong");
		}
	}
}

class pallindrome extends Armstrong {
	pallindrome() {

		int x = 121;
		int results = 0, remain, temp;
		temp = x;
		while (x > 0) {
			remain = x % 10;
			results = (results * 10 + remain);
			x = x / 10;
		}
		if (temp == results) {
			System.out.println("The number is pallindrome");
		} else {
			System.out.println("Entered number is not pallindrome");
		}
	}
}

public class CWH_46_constructor_inherit {
	public static void main(String[] args) {
		pallindrome obj = new pallindrome();
	}
	
}

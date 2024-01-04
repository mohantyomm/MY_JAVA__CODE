package com.omm.java35;
import java.util.Scanner;
public class CWH_35_pr05 {
	static int fibonacci(int x)
	{
		if(x==0)
		{
			return 0;
		}
		else if(x==1)
		{
			return 1;
		}
		else
		{
			return fibonacci(x-1)+fibonacci(x-2);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter the nth term");
		x=sc.nextInt();
		int result=fibonacci(x);
		System.out.println("The "+x+"th term in fibonacci series is "+result);
		sc.close();
	}
}

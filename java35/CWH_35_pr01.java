package com.omm.java35;
import java.util.Scanner;
public class CWH_35_pr01 {
	static void multi_table(int x)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(x+"x"+i+"="+x*i);
		}
	}
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		multi_table(x);
		sc.close();
	}
	 
}

package com.omm.java44;
import java.util.Scanner;

public class college {
	public static void main(String[] args) {
		int x;
		int z;
		Scanner sc = new Scanner(System.in);
		x= sc.nextInt();
		z=sc.nextInt();
		Integer ob=new Integer(x);
		Integer ob1=new Integer(z);
		ob=ob+ob1;
		System.out.println(ob);
		sc.close();
		
		}
}

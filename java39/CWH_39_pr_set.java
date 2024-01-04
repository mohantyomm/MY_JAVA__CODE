package com.omm.java39;
import java.util.Scanner;
import java.lang.Math;

//class square{
//	
//	void area(int x)
//	{
//		x=x*x;
//		System.out.println("The  area of the square is : "+x+"cm2");
//	}
//	void perimeter(int x)
//	{
//		x= 4*x;
//		System.out.println("The perimeter of the square is : "+x+"cm");
//	}
//}

//class rectangle{
//	void area(int x,int y)
//	{
//		int result;
//		result=x*y;
//		System.out.println("The  area of the square is : "+result+"cm2");
//	}
//	void perimeter(int x,int y)
//	{
//		int result;
//		result= 2*(x+y);
//		System.out.println("The perimeter of the square is : "+result+"cm");
//	}
//}

class circle{
	void area(float radious)
	{
		float circle_area;
		double r=Math.pow(radious,2);
		circle_area=(float) (3.14*r);
		System.out.println("Area of the circle is "+circle_area+"cm2");
	}
	void perimeter(float radious)
	{
		float circumference;
		circumference=  (float) ((2*3.14)*(radious));
		System.out.println("The circumference of circle is "+circumference+"cm");
	}
}
public class CWH_39_pr_set {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float radious;
		System.out.println("Enter the value of radious");
		radious=sc.nextFloat();
		circle obj=new circle();
		obj.area(radious);
		obj.perimeter(radious);
		sc.close();
		
//		int length;
//		int breadth;
//		System.out.println("Enter the length: ");
//		length=sc.nextInt();
//		System.out.println("Enter the breadth: ");
//		breadth=sc.nextInt();
//		rectangle obj = new rectangle();
//		obj.area(length,breadth);
//		obj.perimeter(length,breadth);
//		sc.close();
		
//		int side;
//		square obj= new square();
//		obj.area(side);
//		obj.perimeter(side);
//		sc.close();
	}
}

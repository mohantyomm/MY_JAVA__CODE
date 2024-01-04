package com.omm.java32;

public class Method_overloading_object_class {
	static void foo() {
		System.out.println("Welcome to java");
	}
	static void foo(int x)
	{
		System.out.println("Welcom to java"+x);
	}
	static void foo(int x,int y)
	{
		System.out.println("Welcom to java"+x+y);
	}
//	static int foo() {
//		
//	}we can't access method overloading just by changing its return type.
}

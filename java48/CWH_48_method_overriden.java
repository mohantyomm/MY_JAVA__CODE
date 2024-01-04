package com.omm.java48;
class Example{
	
	 void method1()
	{
		System.out.println("This is parent class method");
	}
}
class Example1 extends Example
{
	@Override
	 void method1()
	{
		System.out.println("This method is under derive class");
	}
}
public class CWH_48_method_overriden {
	public static void main(String[] args) {
		Example1 obj = new Example1();
		Example obj1 = new Example();
		obj1.method1();
		obj.method1();
		
	}
}

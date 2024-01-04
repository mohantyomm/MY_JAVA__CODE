package com.omm.java52;

abstract class parent { 
	public void SayHello() {
		System.out.println("Hello Student");
	}

	abstract void greet();
}

class child extends parent {
	void heloo() {
		System.out.println("hello");
	}
	void greet() {
		System.out.println("Hello student");
	}
}
abstract class child3 extends parent{
	public void hi()//if we want to malke another method which is not in abstarct class then we have to declare the class as abstract.
	{
		System.out.println("Hi");
	}
}

public class CWH_52_abstract_class {
	public static void main(String[] args) {
		child obj = new child();
		obj.greet();
		obj.heloo();
		obj.SayHello();
	}
}

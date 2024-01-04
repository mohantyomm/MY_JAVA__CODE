package com.omm.java44;

public class constructor_overloading_rectangle {
	float len;
	float bread;
	float area;
	constructor_overloading_rectangle(float length,float breadth) {
		len=length;
		bread=breadth;
	}
	
	public constructor_overloading_rectangle(float a) {
		area = a;
		System.out.println("The area of the rectangle is "+area); 
	}
	public constructor_overloading_rectangle(int x,float y,float z) {
		 len=y;
		 bread=z;
		 float result;
		 result=2*(len+bread);
		 System.out.println("the circumference of rectangle is "+result);
	}
	public static void main(String[] args) {
		constructor_overloading_rectangle obj = new constructor_overloading_rectangle(3.4f,4.5f);
		float value;
		value=obj.len*obj.bread;
		constructor_overloading_rectangle obj1 = new constructor_overloading_rectangle( value);
		constructor_overloading_rectangle obj2 = new constructor_overloading_rectangle(2, 3.4f,4.5f);
	}
}

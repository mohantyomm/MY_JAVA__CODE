package com.omm.java33;

public class Object_33 {
	static int addition(int ...arr)
	{
		int result=0;
		for(int element:arr)
		{
			result = result+element;
		}
		return result;
	}
}

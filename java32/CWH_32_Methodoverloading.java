package com.omm.java32;
 

public class CWH_32_Methodoverloading {

	public static void main(String[] args) {
//		int x = 5;
//		Object_32 obj = new Object_32();
//		obj.change_num(x);
////		change_num(x);
//		System.out.println(x);
		int arr[]= {2,3,5,6,8,9,465,547};
		int size = arr.length;
		Object_32 obj = new Object_32();
		Object_32.change_arr(arr, size);
		for(int i =0;i<size;i++)
		{
			System.out.println(arr[i] );
		}
		Method_overloading_object_class ob = new Method_overloading_object_class();
		ob.foo();
		ob.foo(6);
		ob.foo(3, 4);
	}

	 
}
// Thus we confirmed that any reference can be change through method but a single variable value can't be change.

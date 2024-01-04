package com.omm.java32;

public class Object_32 {

//	static void change_num(int x) {
//		x = 98;	
//	}
	static void change_arr(int arr[], int size) {
		int temp = 0;
		for (int i = 0; i < size-1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
	}

}

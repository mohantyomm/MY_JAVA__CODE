package com.omm.java35;

public class CWH_35_pr06 {
	float sum(int ...arr)
	{	float i =0;
		float result=0;
		for(int element:arr)
		{
			i++;
			result+=element;
		}
		return result/i;
	}
	public static void main(String[] args) {
		CWH_35_pr06 obj = new CWH_35_pr06();
		System.out.println("Average of of 2,3,4,5,6,7 is ="+obj.sum(2,3,4,5,6,7));
	}
}

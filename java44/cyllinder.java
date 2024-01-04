package com.omm.java44;

public class cyllinder {
	float radious;
	float height;

	cyllinder(float radi,float hei)
	{ 
		 radious=radi;
		 height=hei;		
	}
	void area( ){
		 
		float result=(2*3.14f*radious*radious)+(2*3.14f*radious*height);
		System.out.println("Area is "+result);
	}
	void volume()
	{
		float result_vol;
		result_vol=(3.14f*radious*radious*height);
		System.out.println("the volume of the cyllinder is "+result_vol);
	} 
	public static void main(String[] args) {
		cyllinder obj = new cyllinder(3.4f,4.5f);
		obj.area();
		obj.volume();
	}
}

package com.omm.java44;
class cylinder
{
	private float height;
	private float radious;
	 void getter_height(float h) {
		height=h;
	}
	 float setter_height() {
		return height;
	}
	 void getter_radi(float r) {
		radious=r;
	}
	float setter_radi() {
		return radious;
	}
	float area(){
		float result=(2*3.14f*radious*radious)+(2*3.14f*radious*height);
		return result;
	}
	float volume()
	{
		float result_vol;
		result_vol=(3.14f*radious*radious*height);
		return result_vol;
	}
}
public class CWH_44_pr01 {
	public static void main(String[] args) {
		cylinder obj = new cylinder();
		obj.getter_height(3.4f);
		obj.getter_radi(4.5f);
		System.out.println("Radious of the cylinder is "+obj.setter_radi());
		System.out.println("Height of the cylinder is "+obj.setter_height()+"cm");
		System.out.println("area of the cylinder is "+obj.area()+"cm2");
		System.out.println("The volume of the cyllinder is "+obj.volume()+"cm3");
	}
}

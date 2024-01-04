package com.omm.java45;

class base {
	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}

class derive extends base {
	int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
}

public class CWH_45_intro_to_inheritance {
	public static void main(String[] args) {
		derive obj = new derive();
		int sum;
		obj.setZ(6);
		obj.setX(8);
		sum = obj.getX() + obj.getZ();
		System.out.println("The sum of the two number is " + sum);
	}
}

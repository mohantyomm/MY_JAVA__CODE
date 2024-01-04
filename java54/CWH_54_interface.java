package com.omm.java54;

interface bicycle{
//	making property whichvalue will be constant
	final int a = 45;
//	if we not use final also it will be final by default
	void apply_brake(int decreement);
	void speed_up(int increement);
}
interface horn{
	void blowhorn();
	
}
class Avon implements bicycle,horn{
	public void apply_brake(int decreement)
	{
		System.out.println("Applying Brake");
	}

	@Override
	public void speed_up(int increement) {
		System.out.println("Applying Speed_up");
		
	}
	public void blowhorn()
	{
		System.out.println("ppp");
	}
}
public class CWH_54_interface {
	public static void main(String[] args) {
		Avon obj = new Avon();
		obj.apply_brake(6);
		obj.speed_up(7);
//		You cant modify the properties in interfaces
		System.out.println(obj.a);
		obj.blowhorn();
		 
	}
}

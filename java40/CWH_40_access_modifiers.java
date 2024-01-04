package com.omm.java40;
class Employee{
	private int id;
	private String name;
	void SetName(String x)
	{
		name=x;
	}
	String GetName()
	{
		return name;
	}
	void Setid(int i)
	{
		id=i;
	}
	int Getid()
	{
		return id;
	}
}
public class CWH_40_access_modifiers {
	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.SetName("Chiku");
		System.out.println(obj.GetName());
		obj.Setid(123);
		System.out.println(obj.Getid());
	}
}

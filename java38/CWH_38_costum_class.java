package com.omm.java38;
  class Employee
{
	String id;
	float salary;
	void display_information()
	{
		System.out.println("Employee name = "+id);
		System.out.println("Employee salary ="+salary+"/month");
	}
}

public class CWH_38_costum_class {
	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.id="Chiku";
		obj.salary=45000.25f;
		obj.display_information();
	}
}

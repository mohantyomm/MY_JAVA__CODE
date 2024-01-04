package com.omm.java49;

//import java.util.Calendar;
//
//
//class parent {
//	String x;
//	public void setX(String x) {
//		this.x = x;
//	}
//	void greet() {
//		System.out.println("Good Morning");
//	}
//}
//
//class child extends parent {
//	String method() {
//		Calendar c = Calendar.getInstance();
//		int daytime = c.get(Calendar.HOUR_OF_DAY);
//
//		if (daytime >= 0 && daytime <= 12) {
//			return "Good Morning";
//		} else if (daytime >= 12 && daytime <= 16) {
//			return "Good Afternoon";
//		} else if (daytime >= 16 && daytime <= 19) {
//			return "Good Evening";
//		} else {
//			return "Good night";
//		}
//	}
//}
class phone {
	public void greet() {
		System.out.println("Good Morning");
	}
	public void on() {
		System.out.println("Turning on phone");
	}
}
class smartphone extends phone {
	public void swagat() {
		System.out.println("Apka swagone");
	}
	public void on() {
		System.out.println("Turning on Smartphone");
	}
}

public class CWH_49_dynamic_dispatch {
	public static void main(String[] args) {
//		phone obj = new phone();
//		smartphone obj = new smartphone();
//		obj.name(); 
		phone obj = new smartphone();
		obj.greet();
		obj.on();
	}
}

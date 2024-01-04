//package com.omm.java40;
//import java.util.Scanner;
//import java.lang.reflect.*;
//class circle {
//	  private int radious;
//	  private void display() {
//	    System.out.println("The radious is " + radious);
//	  }
//	}
//public class CWH_40_quick_quiz {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		float RAD;
//		RAD=sc.nextFloat();
//		try {
//		       
//		      circle obj = new circle();
//
//		      
//		      Class obj = obj.getClass();
//
//		       
//		      Field field = obj.getDeclaredField("name");
//		      
//		      field.setAccessible(true);
//		 
//		      field.set(obj, "Programiz");
//
//		       
//		      String value = (String)field.get(obj);
//		      System.out.println("Name: " + value);
//
//		       
//		      Method[] methods = obj.getDeclaredMethods();
//		      System.out.println("Method Name: " + methods[0].getName());
//		      int modifier = methods[0].getModifiers();
//		      System.out.println("Access Modifier: " + Modifier.toString(modifier));
//
//		    }
//		    catch(Exception e) {
//		      e.printStackTrace();
//		    }
//		 
//	}
//}
//
//
//
//
// 
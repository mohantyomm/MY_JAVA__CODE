package pm_batch_assignment_13.com;

import java.util.Scanner;
import OCAC_PACKAGE.*;
public class simple_intrest_using_package {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double p;
		System.out.println("Enter principle amount");
		p=sc.nextDouble();
		double t  ;
		System.out.println("Enter the time period");
		t=sc.nextDouble();
		double r  ;
		System.out.println("Enter r value");
		r=sc.nextDouble();
		Simple_Intrest obj = new Simple_Intrest();
		obj.SI(p, t, r);
		sc.close();
		
		
	}
}

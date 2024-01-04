package pm_batch_assignment_12.com;
import java.util.*;
public class simple_intrest_using_scanner_class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double SI;
		double p;
		System.out.println("Enter principle amount");
		p=sc.nextDouble();
		double t  ;
		System.out.println("Enter the time period");
		t=sc.nextDouble();
		double r  ;
		System.out.println("Enter r value");
		r=sc.nextDouble();
		SI=(p*t*r)/100;
		System.out.println("simpleintrest is  ="+SI);
		sc.close();
		
	}
}

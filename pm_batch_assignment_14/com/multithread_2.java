package pm_batch_assignment_14.com;
import java.util.Scanner;
class multithread_for_leap_year_SI_Div extends Thread{
	public void run() {
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
		int num;
		System.out.println("Enter the num to check if it is divisible by 3 and 5 both or not ");
		num = sc.nextInt();
		if((num%3)==0 && (num%5)==0) {
			System.out.println("Num is divisible by both 3 and 5");
		}
		else {
			System.out.println("Num is not divisible by both 3and 5");
		}
		int year;
	      System.out.println("Enter an Year :: ");
	      year = sc.nextInt();

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) 		 {
	         System.out.println("Specified year is a leap year");
	         }
	      else {
	    	  System.out.println("The entered year is not a leap year");
	      }
		sc.close();
	}
}
public class multithread_2 {
	public static void main(String[] args) {
		multithread_for_leap_year_SI_Div obj = new multithread_for_leap_year_SI_Div();
		obj.start();
	}
}

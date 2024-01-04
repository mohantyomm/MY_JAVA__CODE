package pm_batch_assignment_14.com;
import java.util.Scanner;
class multithread_Num_even_odd extends Thread{
	public void run() {
		Scanner sc = new Scanner(System.in);
		int num  ;
		System.out.println("Enter the num to check whether it is even or odd ");
		num = sc.nextInt();
		if(num%2==0) {
			System.out.println("Num is even");
		}
		else {
			System.out.println("Num is odd");
		}
		sc.close();
	}
}
class multithread_volume_of_cube extends Thread{
	public void run() {
		Scanner sc = new Scanner(System.in);
		double a;
		System.out.println("Enter the side value of cube");
		a=sc.nextDouble();
		System.out.println("Volume of cube is "+(a*a*a));
		sc.close();
	}
}
class multithread_area_of_rectangle extends Thread{
	public void run() {
		Scanner sc = new Scanner(System.in);
		int fact_num ;
		System.out.println("Enter the num  to find out the factorial ");
		fact_num=sc.nextInt();
		int fact=1;
		for(int i = 1;i<=fact_num;i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+ fact_num+" is = "+fact);
		double length;
		double breadth;
		System.out.println("Enter the length of the rectangle ");
		length=sc.nextDouble();
		System.out.println("Enter the breadth of the rectangle");
		breadth=sc.nextDouble();
		System.out.println("Area of the rectangle is "+(length*breadth));
		sc.close();
	}
}


public class multithreading {
	public static void main(String[] args) {
		multithread_Num_even_odd obj = new multithread_Num_even_odd();
		multithread_volume_of_cube obj1 = new multithread_volume_of_cube();
		multithread_area_of_rectangle obj2 = new multithread_area_of_rectangle();
		obj2.start();
		obj1.start();
		obj.start();
	}
}

package pm_batch_assignment_15.com;

import java.util.Scanner;

 

class volume_of_sphere extends Thread {
	 public void run() {
		 Scanner sc = new Scanner(System.in);
			double radious;
			System.out.println("Enter the radious of the sphere");
			radious=sc.nextDouble();
			double volume;
			volume=(4*3.141*radious*radious*radious)/3;
			System.out.println("The volume of the sphere is = "+volume);
			sc.close();
	 }
}
class volume_of_cube extends Thread{
	public void run() {
		Scanner sc = new Scanner(System.in);
		double a;
		System.out.println("Enter the side value of cube ");
		a=sc.nextDouble();
		double volume=a*a*a;
		System.out.println("Volume of the cube is = "+volume);
		sc.close();
	}
}
class sum_even extends Thread{
	public void run() {
		int sum=0;
		for(int i =1;i<=10;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("sum of the even number from 1 to 10 is = "+sum);
	}
}
class count_odd_num extends Thread{ 
	public void run() {
		System.out.println("odd number present in between 1 to 20 are = ");
		for(int i =1;i<=20;i++) {
			if(i%2==0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}
}
public class multithreading_sum_even_count_odd_cobe_volume_sphere_volume {
	public static void main(String[] args) {
		sum_even obj = new sum_even();
		count_odd_num obj1 = new count_odd_num();
		volume_of_cube obj2 = new volume_of_cube();
		volume_of_sphere obj3 = new volume_of_sphere();
		obj.start();
		obj1.start();
		obj2.start();
		obj3.start();
	}
}

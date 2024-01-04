package pm_batch_assignment_16.com;
import java.util.Scanner;
class even extends Thread{
	public void run() {
		Scanner sc = new Scanner(System.in);
		int num ;
		System.out.println("Enter the num to check wheather it is even or not ");
		num = sc.nextInt();
		if(num%2==0) {
			System.out.println("Num is even");
		}
		else {
			System.out.println("Num is not even");
		}
		sc.close();
	}
}
class odd extends Thread{
	public void run() {
		Scanner sc = new Scanner(System.in);
		int num ;
		System.out.println("Enter the num to check wheather it is odd or not ");
		num = sc.nextInt();
		if(num==0) {
			System.out.println("Num is not odd");
		}
		else if(num%2==0) {
			System.out.println("Num is not odd");
		}
		else {
			System.out.println("Num is odd");
		}
		sc.close();
	}
}
public class even_odd {
	public static void main(String[] args) {
		even obj = new even();
		odd obj1 = new odd();
		obj.start();
		obj1.start();
	}
}

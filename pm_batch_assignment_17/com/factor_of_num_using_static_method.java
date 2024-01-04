package pm_batch_assignment_17.com;
import java.util.Scanner;
public class factor_of_num_using_static_method {
	public static void fact(int num) {
		int factorial=1;
		for(int i =1;i<=num;i++) {
			factorial*=i;
		}
		System.out.println("Factorial of the "+num+" is = "+factorial);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the num ");
		num = sc.nextInt();
		fact(num);
		sc.close();
	}
}

package pm_batch_assignment_12.com;
import java.util.Scanner;
public class num_even_or_odd_using {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the num for check ");
		num = sc.nextInt();
		if(num%2==0) {
			System.out.println("entered number is even ");
		}
		else {
			System.out.println("Entered number is not a even number");
		}
		sc.close();
	}
}

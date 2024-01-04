package pm_batch_assignment_13.com;
import OCAC_PACKAGE.*;
import java.util.Scanner;
public class prime_num_check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number to be checked ");
		num = sc.nextInt();
		Prime obj = new Prime();
		obj.prime_check(num);
		sc.close();
		
	}
}

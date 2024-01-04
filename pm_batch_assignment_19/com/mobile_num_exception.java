package pm_batch_assignment_19.com;
import java.util.InputMismatchException;
import java.util.Scanner;
public class mobile_num_exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mobile_no;
		System.out.println("Enter the mobile no ");
		try {
			mobile_no=sc.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println(e);
			System.out.println("Entered input is INVALID !");
		}
		sc.close();
	}
}

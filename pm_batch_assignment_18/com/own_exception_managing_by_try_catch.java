package pm_batch_assignment_18.com;
import java.util.Scanner;
public class own_exception_managing_by_try_catch {
	public static void main(String[] args) {
		int x;
		System.out.println("Enter the value of x");
		Scanner sc = new Scanner(System.in);
		try {
			x=sc.nextInt();
			System.out.println(x);
		} catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}
}

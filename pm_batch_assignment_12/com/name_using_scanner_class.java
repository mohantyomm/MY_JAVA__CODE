package pm_batch_assignment_12.com;
import java.util.Scanner;
public class name_using_scanner_class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first_name;
		System.out.println("Enter the first name");
		first_name=sc.nextLine();
		String middle_name;
		System.out.println("Enter the middle name");
		middle_name=sc.nextLine();
		String last_name;
		System.out.println("Enter the last name");
		last_name=sc.nextLine();
		System.out.println("YOUR FUll NAME IS = "+first_name+" "+middle_name+" "+last_name);
		sc.close();
	}
}

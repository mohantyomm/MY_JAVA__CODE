package pm_batch_assignment_13.com;
import OCAC_PACKAGE.StudentInfo;
import java.util.Scanner;
public class student_information_finder {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int ROll_no;
		System.out.println("Enter the roll no to find out student details ");
		System.out.println("Enter the roll no between 1 to 5");
		ROll_no=sc.nextInt();
		StudentInfo obj = new StudentInfo();
		obj.details(ROll_no);
		sc.close();
	}
}

package pm_batch_assignment_4.com;

public class grades_student {
	public static void main(String[] args) {
		int secured_marks=89;
		switch(secured_marks/10) {
		case 10:
			System.out.println("Grade honours");
			break;
		case 9:
			System.out.println("Grade honours");
			break;
		case 8:
			System.out.println("Grade First Division");
			break;
		case 7:
			System.out.println("Grade Second Division");
			break;
		case 6:
			System.out.println("Grade Third Division");
			break;
		case 5:
			System.out.println("Grade pass");
			break;
		case 4:
			System.out.println("Grade pass");
			break;
		case 3:
			System.out.println("Grade pass");
			break;
		default :
			System.out.println("student failed");
		}
	}
}

package pm_batch_assignment_4.com;

public class Intro_to_switch_statement {
	public static void main(String[] args) {
		char b = '+';
		switch(b) {
		case '+':
			System.out.println("The expression is addition");
			break;
		case '-':
			System.out.println("The expression is substraction");
			break;
		case '*':
			System.out.println("The expression is multiplication");
			break;
		case '/':
			System.out.println("The expression is division");
			break;
		}
	}
}

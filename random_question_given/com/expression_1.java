package random_question_given.com;
import OCAC_PACKAGE.*;
import java.util.Scanner;

public class expression_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		expression_result_finder obj = new expression_result_finder();
		
		double a;
		System.out.println("Enter the value of a = ");
		a = sc.nextDouble();
		double b;
		System.out.println("Enter the value of b = ");
		b = sc.nextDouble();
		double c;
		System.out.println("Enter the value of c = ");
		c = sc.nextDouble();
		double d;
		System.out.println("Enter the value of d = ");
		d = sc.nextDouble();
		obj.resulting_expression(a, b, c, d);
		sc.close();
	}
}

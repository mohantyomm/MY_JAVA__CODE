package pm_batch_assignment_12.com;
import java.util.Scanner;
public class area_perimeter_of_circle_using_scanner_class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radious;
		System.out.println("Enter the radious of the circle");
		radious=sc.nextDouble();
		double perimeter;
		perimeter = 2* 3.14*radious;
		double area;
		area = 3.14*radious*radious;
		System.out.println("The area of the circle is = "+area);
		System.out.println("The perimeter of the circle is = "+perimeter);
		sc.close();
	}
}

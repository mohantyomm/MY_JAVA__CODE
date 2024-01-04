package pm_batch_assignment_17.com;
import java.util.Scanner;
public class area_square_rectangle {
	public static void area_rectangle_square(double side,double length,double breadth) {
		System.out.println("area of the square is "+(side*side));
		System.out.println("area of the rectangle is = "+(length*breadth));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double side_of_square;
		double length_of_rectangle;
		double breadth_of_rectangle;
		System.out.println("Enter the side value of square ");
		side_of_square=sc.nextDouble();
		System.out.println("Enter the length of the rectangle");
		length_of_rectangle=sc.nextDouble();
		System.out.println("enter the breadth of the rectangle ");
		breadth_of_rectangle=sc.nextDouble();
		area_rectangle_square(side_of_square, length_of_rectangle, breadth_of_rectangle);
		sc.close();
		
	}
}

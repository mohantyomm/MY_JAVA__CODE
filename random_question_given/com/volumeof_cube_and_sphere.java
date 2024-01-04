package random_question_given.com;
import OCAC_PACKAGE.*;
import java.util.Scanner;
public class volumeof_cube_and_sphere {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		volume_of_cube obj = new volume_of_cube();
		Sphere_Volume obj1 = new Sphere_Volume();
		double radious;
		System.out.println("enter the radious of the sphere");
		radious = sc.nextDouble();
		double side;
		System.out.println("Enter the side value of the cube ");
		side = sc.nextDouble();
		obj.cube_volume(side);
		obj1.sphere(radious);
		sc.close();
	}
}

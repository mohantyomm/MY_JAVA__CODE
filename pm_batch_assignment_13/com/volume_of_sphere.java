package pm_batch_assignment_13.com;
import OCAC_PACKAGE.*;
import java.util.Scanner;
public class volume_of_sphere {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radious;
		System.out.println("Enter the radious of the sphere");
		radious=sc.nextDouble();
		Sphere_Volume obj = new Sphere_Volume();
		obj.sphere(radious);
		sc.close();
	}
}

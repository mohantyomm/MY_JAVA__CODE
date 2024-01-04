package pm_batch_assignment_17.com;
import java.util.Scanner;
public class volume_of_sphere {
	public static void sphere_volume(double radious) {
		double PI=3.141;
		System.out.println("volume of the sphere is ="+((4*PI*radious*radious*radious)/3));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radious;
		System.out.println("Enter the radious value of the sphere ");
		radious=sc.nextDouble();
		sphere_volume(radious);
		sc.close();
	}
}

package pm_batch_assignment_17.com;
import java.util.Scanner;
public class volume_of_cube_using_static_method {
	public static void cube_volume(int side) {
		System.out.println("volume of the cube is ="+(side*side*side));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int side;
		System.out.println("Enter the side value of the cube ");
		side=sc.nextInt();
		cube_volume(side);
		sc.close();
	}
}

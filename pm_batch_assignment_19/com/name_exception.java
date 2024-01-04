package pm_batch_assignment_19.com;
 
import java.util.Scanner;
public class name_exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter your name");
		name=sc.nextLine();
		
		try {
			 String s2 = "@"+name+"_";
//			 int val = Integer.parseInt(name);
			 Integer i1 = new Integer(s2);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}

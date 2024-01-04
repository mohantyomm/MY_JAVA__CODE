package pm_batch_assignment_18.com;

public class MyExceptionSolve {
	public static void main(String[] args) {
		System.out.println("Line 1");
		System.out.println("Line 2");
		try {
			int a=100/20;
		}
		catch (Exception e) {
			System.out.println("Due to integer divisible by zero");
		}
		System.out.println("Line 4");
		System.out.println("Line 5");
	}
}
// TODO if catch block will execute then there is a exception in try block and if there is catch 
// block will execute else catch block will not going to execute.

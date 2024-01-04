package pm_batch_assignment_17.com;

public class TestStaticBlock {
	static int a = 100;
	static int b = 200;
	static int Addition;
	static {
		Addition=a+b;
	}
	public static void main(String[] args) {
		System.out.println("Addition value is = "+Addition);
	}
}

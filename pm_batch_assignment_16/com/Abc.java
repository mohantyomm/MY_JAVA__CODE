package pm_batch_assignment_16.com;
class Abcd{
	public void m1() {
		System.out.println("Welcome");
	}
}
class Bcd extends Abcd{
	
}
public class Abc {
	public static void main(String[] args) {
		Bcd obj = new Bcd();
		obj.m1();
	}
}

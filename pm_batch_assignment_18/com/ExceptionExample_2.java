package pm_batch_assignment_18.com;

public class ExceptionExample_2 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		try {
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
}

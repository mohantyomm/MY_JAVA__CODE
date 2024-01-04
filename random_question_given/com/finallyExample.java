package random_question_given.com;

public class finallyExample {
	public static void main(String[] args) {
		try {
			int a[]= {1,3,4,5};
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Acessing array element is out of specified limits");
		}
		finally {
			System.out.println("This message will show whether there is exception or not");
		}
	}
}
// TODO finally block will be executed always whether there is exception occurs or not in the try block...
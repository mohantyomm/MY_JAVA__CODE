package pm_batch_assignment_18.com;

public class format_exception {
	public static void main(String[] args) {
		try {
		
		String s1="abcd";
		int a=Integer.parseInt(s1);
		
	
		}
		catch(NumberFormatException e) {
//			System.out.println("number format exception");
			System.out.println(e);
			
		}
		
	}
}

package pm_batch_assignment_4.com;

public class even_factors_of_a_number {
	public static void main(String[] args) {
		int num = 30;
		for(int i =1;i<=30;i++) {
			if((num%i)==0 && (i%2)==0) {
				System.out.println("The even factor is = "+i);
			}
		}
	}
}

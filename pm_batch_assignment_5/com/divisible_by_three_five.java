package pm_batch_assignment_5.com;

public class divisible_by_three_five {
	public static void main(String[] args) {
		for(int i =1;i<=20;i++) {
			if((i%3)==0 && (i%5)==0) {
				System.out.println("The num which is divisible by both 3 and 5 = "+i);
			}
		}
	}
}

package pm_batch_assignment_5.com;

 

public class sum_of_even_odd {
	public static void main(String[] args) {
		int sum_even=0;
		int sum_odd=0;
		for(int i =1;i<=20;i++) {
			if((i%2)==0) {
				sum_even+=i;
			}
			else {
				sum_odd+=i;
			}
		}
		System.out.println("Sum of even num from 1 to 20 is = " + sum_even);
		System.out.println("Sum of odd num from 1 to 20 is = "+sum_odd);
		
	}
}

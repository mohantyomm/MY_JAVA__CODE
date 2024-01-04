package pm_batch.com;
 

public class divisible_by_both_five_and_three {
	public static void main(String[] args) {
		 
		int num=15;
		 
		if((num%3)==0 && (num%5)== 0) {
			System.out.println("The num is divisible by both 5 and 3");
		}
		if((num%3)==0 && (num%5)!= 0) {
			System.out.println("The num is not divisible by both 5 and 3");
		}
		if((num%3)!=0 && (num%5)== 0) {
			System.out.println("The num is not divisible by both 5 and 3");
		}
		if((num%3)!=0 && (num%5)!= 0) {
			System.out.println("The num is not divisible by both 5 and 3");
		}
	}
}

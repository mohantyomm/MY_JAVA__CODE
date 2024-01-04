package pm_batch_assignment_4.com;

public class even_and_greater_than_twenty_from_one_to_thirty {
	public static void main(String[] args) {
		int num = 0;
		for(int i =1;i<=30;i++) {
			if(i>20 && (i%2)==0) {
				num++;
			}
		}
		System.out.println("The num which is even and greater than 20 present in bet 1 to 30 is = "+num);
	}
}

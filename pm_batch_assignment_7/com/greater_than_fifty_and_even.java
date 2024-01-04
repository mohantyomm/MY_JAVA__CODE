package pm_batch_assignment_7.com;

public class greater_than_fifty_and_even {
	 public static void main(String[] args) {
		int arr[]= {52,54,55,67,88,98,69,90,550,100};
		int count = 0;
		for(int i =0;i<10;i++) {
			if((arr[i]%2)==0 && arr[i]>50) {
				count++;
			}
			else {
				continue;
			}
		}
		System.err.println("Total number which is greater than 50 and even is = "+count);
	}
}

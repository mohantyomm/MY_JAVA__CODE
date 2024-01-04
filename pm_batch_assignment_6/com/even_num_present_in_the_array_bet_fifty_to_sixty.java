package pm_batch_assignment_6.com;

public class even_num_present_in_the_array_bet_fifty_to_sixty {
	public static void main(String[] args) {
		int arr[]= {50,51,52,53,54,55,56,57,58,59,60};
		int size = arr.length;
		for(int i = 0;i<size;i++) {
			if((arr[i]%2)==0) {
				System.out.println(arr[i]);
			}
		}
	}
}

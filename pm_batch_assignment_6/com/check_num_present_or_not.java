package pm_batch_assignment_6.com;

public class check_num_present_or_not {
	public static void main(String[] args) {
		int num = 10;
		int temp =0;
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int size = arr.length;
		for(int i =0;i<size;i++) {
			if(arr[i]==num) {
				System.out.println("Number is found in index number  = "+i);
				temp++;
			}
		}
		if(temp==0) {
			System.out.println("Number not found");
		}
	}
}

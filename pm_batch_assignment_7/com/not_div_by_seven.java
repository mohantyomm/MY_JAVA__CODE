package pm_batch_assignment_7.com;

public class not_div_by_seven {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i =0;i<10;i++) {
			if(arr[i]%7==0) {
				continue;
			}
			else {
				System.out.println(arr[i]);
			}
		}
	}
}

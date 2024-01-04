package pm_batch_assignment_7.com;

public class small_large_array {
	public static void main(String[] args) {
		int arr[]= {1,3,2,4,5,6,7,43,456,34};
		int small=arr[0];
		int size = arr.length;
		int large = arr[0];
		for(int i =0;i<size;i++) {
			if(arr[i]<large) {
				continue;
			}
			else {
				large=arr[i];
			}
		}
		for(int j =0;j<size;j++) {
			if(arr[j]>small) {
				continue;
			}
			else {
				small=arr[j];
			}
		}
		System.out.println("small = "+small);
		System.out.println("large = "+large);
	}
}

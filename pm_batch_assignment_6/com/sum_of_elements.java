package pm_batch_assignment_6.com;

public class sum_of_elements {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int sum =0;
		int size = arr.length;
		for(int i =0;i<size;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of the element is = "+sum);
	}
}

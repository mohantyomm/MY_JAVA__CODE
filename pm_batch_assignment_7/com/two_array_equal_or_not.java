package pm_batch_assignment_7.com;

public class two_array_equal_or_not {
	public static void main(String[] args) {
		int arr[]= {1,3,2,4,5,6,7,43,456,34};
		int array[]= {1,3,2,4,5,6,7,43,456,34};
		int size = arr.length;
		int size2 = array.length;
		int temp = 0;
		if(size == size2) {
			for(int i =0;i<size;i++) {
				if(arr[i]==array[i]) {
					continue;
				}
				else {
					temp++;
					break;
				}
			}
			if(temp==0) {
				System.out.println("Array are same");
			}
		}
		else {
			System.out.println("array are different");
		}
		
		 
	}
}

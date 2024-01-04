package pm_batch_assignment_6.com;

public class count_even_odd {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,6,7,8,9,67,88,20};
		int even = 0;
		int odd = 0;
		int size = arr.length;
		for(int i = 0;i<size;i++) {
			if(arr[i]==0) {
				continue;
			}
			else if((arr[i]%2)==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("number of even num present = "+even);
		System.out.println("number of odd num present = "+odd);
		
	}
}

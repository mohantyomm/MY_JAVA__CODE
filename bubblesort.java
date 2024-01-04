
public class bubblesort {
	public static void main(String[] args) {
		int arr[] = {0, 1,0,1,0,1,0};
		int size = arr.length;
		int temp = 0;
		for (int i = 0; i < size-1 ; i++) {
			for (int j = 0; j < size-1-i; j++) {
				if(arr[j]>arr[j+1]){ 
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.print("{");
		for (int k = 0; k < size; k++) {
			System.out.print(arr[k]);
			if(k==size-1) {
				break;
			}
			else {
				System.out.print(",");
			}
		}
		System.out.println("}");
	}
}

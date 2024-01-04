package random_question_given.com;

public class sum_of_first_last_array {
	public static void main(String[] args) {
		int arr[]= {50,51,52,53,54,55,56,57,58,59,60};
		int sum_unit = 0;
		int sum_tenth=0;
		int unit =0;
		int tenth = 0;
		
		for(int i =0;i<arr.length;i++) {
			unit = arr[i]%10;
			tenth=arr[i]/10;
			sum_tenth+=tenth;
			sum_unit+=unit;
		}
		System.out.println("sum of unit place is ="+sum_unit);
		System.out.println("sum of tenth place is ="+sum_tenth);
	}
}

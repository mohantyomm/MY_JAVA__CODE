package pm_batch_assignment_15.com;
class same_digit_count extends Thread{
	public void run() {
		int count = 0;
		int first;
		int second;
		for(int i =1;i<=100;i++) {
			first=i/10;
			second=i%10;
			if(first==second) {
				count++;
			}
		}
		System.out.println("Total similar digit number is ="+count);
			
	}
}
public class Thread_to_count_similar_digit_num_from_1_to_100 {
	public static void main(String[] args) {
		same_digit_count obj = new same_digit_count();
		obj.start();
	}
}

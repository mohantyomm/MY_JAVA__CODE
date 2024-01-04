package pm_batch_assignment_15.com;
class temp extends Thread{
	public void run() {
		for(int i =10;i<=30;i++) {
			if((i%2)==0 && i>15) {
				System.out.println(i);
			}
		}
	}
}
public class Thread_print_even_number_from_ten_to_thirty_and_greater_than_15 {
	public static void main(String[] args) {
		temp obj = new temp();
		obj.start();
	}
}

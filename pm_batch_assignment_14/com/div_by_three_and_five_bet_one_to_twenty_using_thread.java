package pm_batch_assignment_14.com;
class check extends Thread{
	public void run() {
		System.out.println("The which is divisible by both 5 and 3 between 1 to 50  are : ");
		for(int i =1;i<=50;i++) {
			if((i%3)==0 && (i%5)==0) {
				System.out.println(i);
			}
		}
	}
}
public class div_by_three_and_five_bet_one_to_twenty_using_thread {
	public static void main(String[] args) {
		check obj = new check();
		obj.start();
	}
}

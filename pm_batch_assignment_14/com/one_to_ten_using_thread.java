package pm_batch_assignment_14.com;
class Num_print extends Thread{
	public void run(){
		 for(int i =1;i<=10;i++) {
			 System.out.println(i);
		 }
	}
}
public class one_to_ten_using_thread {
	public static void main(String[] args) {
		Num_print obj = new Num_print();
		obj.start();
	}
}

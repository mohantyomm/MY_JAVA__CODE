package pm_batch_assignment_14.com;

class Num_printing extends Thread{
	public void run(){
		 for(int i =20;i>=1;i--) {
			 System.out.println(i);
		 }
	}
}
public class twenty_to_one_using_thread {
	public static void main(String[] args) {
		Num_printing obj = new Num_printing();
		obj.start();
	}
}

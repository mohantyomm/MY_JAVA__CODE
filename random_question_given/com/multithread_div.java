package random_question_given.com;
 
class not_div_five extends Thread{
	public void run() {
		 
		System.out.println("The number which is not divisible by 5 from 1 to 100 are ");
		for(int i=1;i<=100;i++) {
			if(i%5==0){
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}
}
class div_ten extends Thread{
	public void run() {
		System.out.println("The number which is divisble by 10 from 1 to 100 are" );
		for(int i =1;i<=100;i++) {
			if(i%10==0) {
				System.out.println(i);
			}
		}
	}
}
public class multithread_div {
	public static void main(String[] args) {
		not_div_five obj = new not_div_five();
		div_ten obj1 = new div_ten();
		obj.start();
		obj1.start();
		
	}
}

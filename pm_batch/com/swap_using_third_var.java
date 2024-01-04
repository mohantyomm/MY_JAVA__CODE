package pm_batch.com;

public class swap_using_third_var {
	public static void main(String[] args) {
		int a =10;
		int b =12;
		int temp=0;
		 System.out.println("Before swap");
	        System.out.println("A = "+a+" B = "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swap");
        System.out.println("A = "+a+" B = "+b);
	}
}

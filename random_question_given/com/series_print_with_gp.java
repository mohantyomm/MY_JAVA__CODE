package random_question_given.com;
import java.util.Scanner;
 
public class series_print_with_gp {
	public static double gp(int num) {
		if(num==1) {
			return 1;
		}
		else {
			return  Math.pow(2,num)-1;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the n value ");
		n=sc.nextInt();
		for(int i =1;i<=n;i++) {
			System.out.println((int)(gp(i)));
		}
		sc.close();
	}
}

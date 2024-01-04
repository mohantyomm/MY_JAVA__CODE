package random_question_given.com;
import java.util.Scanner;
public class Check_four_digit_num_even_or_not_each_digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a 4 digit number ");
		num=sc.nextInt();
		int initial;
		initial = num;
		int temp =0;
		int r;
		int flag=1;
		while(initial!=0) {
			initial=initial/10;
			temp++;
		}
		if(temp<4 || temp >4) {
			System.out.println("Entered the wrong number ");
		}
		else {
			while(num!=0) {
				r=num%10;
				if(r%2!=0) {
					flag++;
				}
				num=num/10;
			}
			if(flag==1) {
				System.out.println("Entered number digit is even ");
			}
			else {
				System.out.println("Entered number digit is odd");
			}
		}
		sc.close();
		
	}
}

package random_question_given.com;
 
import java.util.Scanner;
public class future_number_guess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first_num;
		System.out.println("Enter the first 4 digit number ");
		first_num=sc.nextInt();
		int future_num;
		future_num=first_num+19998;
		int second_num;
		System.out.println("Enter the second 4 digit number ");
		second_num=sc.nextInt();
		int first_computer_genrate_num;
		first_computer_genrate_num=9999-second_num;
		System.out.println("Computer given num is "+first_computer_genrate_num);
		int third_num;
		System.out.println("Enter the third 4 digit num");
		third_num=sc.nextInt();
		int second_computer_generate_num;
		second_computer_generate_num=9999-third_num;
		System.out.println("Computer given second num is "+second_computer_generate_num);
		int sum_of_all=first_num+second_num+third_num+first_computer_genrate_num+second_computer_generate_num;
		if(future_num==sum_of_all) {
			System.out.println("future predicted number is true ");
		}
		else {
			System.out.println("Future predicted number is false");
		}
		sc.close();
	}
}

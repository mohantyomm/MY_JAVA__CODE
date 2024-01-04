package pm_batch_assignment_12.com;
import java.util.Scanner;

public class input_birthday {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int birth_day;
		System.out.println("Enter the birth day");
		do {
			birth_day = sc.nextInt();
			if(birth_day<1 || birth_day>31) {
				System.out.println("Invalid data pls enter again");
			   }
		}while(birth_day<1 || birth_day>31);
		int birth_month;
		System.out.println("Enter the birth month");
		do {
			birth_month = sc.nextInt();
			if(birth_month<1 || birth_month>12) {
				System.out.println("Invalid data pls enter again");
			} 
		}while(birth_month<1 || birth_month>12);
		 
		int birth_year;
		System.out.println("Enter the birth year");
		
		do {
			birth_year = sc.nextInt();
			if( birth_year>2023) {
				System.out.println("Invalid data pls enter again");
			}
		}while(birth_year>2023);
		
		System.out.println("Your first birthday is "+birth_day+"-"+birth_month+"-"+(birth_year+1));
		sc.close();
	}
}


package pm_batch_assignment_12.com;
import java.util.Scanner;

public class age_calculator_prg {
	public static void age_calculator(int day,int month,int year,int current_day,int current_month,int current_year){
		int age_year=0;
		int age_month=0;
		int age_day = 0;
		if(month==current_month && day>current_day) {
			age_year=current_year-year-1;
			age_month=12+current_month-month-1;
			age_day=30+current_day-day+1;
		}
		else if( month==current_month && day<current_day){
			age_year=current_year-year;
			age_month=0;
			age_day=current_day-day;
		}
		else if( month>current_month && day>current_day){
			age_year=current_year-year-1;
			age_month=12-(month-current_month);
			age_day=30+current_day-day;
		} 
		else if( month>current_month && day<current_day){
			age_year=current_year-year-1;
			age_month=12-(month-current_month);
			age_day=current_day-day;
		} 
		else if( month<current_month && day>current_day){
			age_year=current_year-year;
			age_month= current_month-month-1;
			age_day=30+current_day-day;
		} 
		else if( month<current_month && day<current_day){
			age_year=current_year-year;
			age_month=current_month-month;
			age_day=current_day-day;
		} 
		System.out.println("Your age is = "+age_year+" year "+age_month+" month "+age_day+" day ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int current_day;
		int current_month;
		int current_year;
		System.out.println("Enter your current day");
		current_day=sc.nextInt();
		System.out.println("Enter your current month");
		current_month=sc.nextInt();
		System.out.println("Enter your current year");
		current_year=sc.nextInt();
		
		int birth_day;
		int birth_month;
		int birth_year;
		System.out.println("Enter your birthday");
		birth_day=sc.nextInt();
		System.out.println("Enter your birth month");
		birth_month=sc.nextInt();
		System.out.println("Enter your birth year");
		birth_year=sc.nextInt();
		
		if(birth_day<1 || birth_day>30 || birth_month<1 || birth_month>12 || birth_year>2023 || birth_month==current_month && birth_year==current_year) {
			System.out.println("entered wrong data please input the data  again");
		}
		else {
			age_calculator(birth_day,birth_month,birth_year,current_day,current_month,current_year);
		}
	
 
		sc.close();
	}
}

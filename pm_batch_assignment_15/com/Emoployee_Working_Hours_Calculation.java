package pm_batch_assignment_15.com;
import java.util.Scanner;
public class Emoployee_Working_Hours_Calculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Entry_period ;
		System.out.println("Enter the entry period Am=1 or Pm=0 ");
		Entry_period=sc.nextInt();
		int entry_time_hour;
		System.out.println("Enter the entry time hour ");
		entry_time_hour=sc.nextInt();
		int entry_time_minute;
		System.out.println("Enter the entry time minute");
		entry_time_minute=sc.nextInt();
		int Exit_period ;
		System.out.println("Enter the exit period am=1 or Pm=0 ");
		Exit_period=sc.nextInt();
		int exit_time_hour;
		System.out.println("Enter the exit time hour ");
		exit_time_hour=sc.nextInt();
		int exit_time_minute;
		System.out.println("Enter the exit time minute");
		exit_time_minute=sc.nextInt();
		int working_hour=0;
		int working_minute=0;
		if(Entry_period==1 && Exit_period==1) {
			working_hour=exit_time_hour-entry_time_hour;
			if(entry_time_minute>exit_time_minute) {
				working_hour--;
				working_minute=(exit_time_minute+60)-entry_time_minute;
			}
			else if(entry_time_minute<exit_time_minute) {
//				working_hour++;
				working_minute=exit_time_minute-entry_time_minute;
			}
			else {
				working_minute=0;
			}
		}
		else if(Entry_period==1 && Exit_period==0) {
			working_hour=(12-entry_time_hour)+exit_time_hour;
			if(entry_time_minute==0) {
				working_minute=exit_time_minute;
			}
			else {
				working_hour--;
				working_minute=(60-entry_time_minute)+exit_time_minute;
			}
		}
		else if(Entry_period==0 && Exit_period==0) {
			working_hour=exit_time_hour-entry_time_hour;
			if(entry_time_minute<exit_time_minute) {
				working_minute=exit_time_minute-entry_time_minute;
			}
			else if(entry_time_minute>exit_time_minute) {
				if(working_hour==0) {
					working_hour=0;
				}
				else{
					working_hour--;
				}
				working_minute=(60-entry_time_minute)+exit_time_minute;
			}
			else {
				working_minute=0;
			}
		}
		if(working_minute==60) {
			working_hour++;
			working_minute=0;
		}
		else if(working_minute>60) {
			working_hour++;
			working_minute=working_minute-60;
		}
//		else {
//			System.out.println("Working time of employee is "+working_hour+" hour "+working_minute+" minute ");
//		}
		System.out.println("Working time of employee is "+working_hour+" hour "+working_minute+" minute ");
		sc.close();
	}
}

package pm_batch_assignment_13.com;
import java.util.*;
public class ATM_Operation {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int pin ;
		int total_balance= 100000;
		int temp=0;
		 do {
			 if(temp == 3) {
				 System.out.println("You have attempted Number of times");
				 break;
			 }
			 System.out.println("Enter your pin");
			 pin = sc.nextInt();
			 if(pin >= 1000 && pin<= 9999) {
				 System.out.println("Enter 1: deposit money \n 2: Withdraw money \n 3: Balance check \n 4: Exit");
				 int key;
				 key=sc.nextInt();
				 if(key==1) {
					 System.out.println("Enter the money for deposit ");
					 int deposit_money;
					 deposit_money=sc.nextInt();
					 if(deposit_money%100==0) {
						 total_balance=total_balance+deposit_money;
						 System.out.println("Deposit succesfull");
					 }
					 else {
						 System.out.println("Wrong amount entered");
					 }
				 }
				 if(key==2) {
					 System.out.println("Enter the money for withdraw ");
					 int withdraw_money;
					 withdraw_money=sc.nextInt();
					 if(withdraw_money%100==0) {
						 total_balance=total_balance-withdraw_money;
						 System.out.println("withdraw succesfull");
					 }
					 else {
						 System.out.println("Wrong amount Entered");
					 }
				 }
				 if(key==3) {
					 System.out.println("Your total balance is = "+total_balance);
				 }
				 if(key == 4) {
					 System.out.println("Exit Succesfull");
					 System.out.println("Remove your card");
					 break;
				 }
				 
			 }
			 else {
				 temp++;
			 }
		 }while(pin < 1000 || pin> 9999);
		sc.close(); 
	}
}

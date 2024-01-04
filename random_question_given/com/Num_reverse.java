package random_question_given.com;
import java.util.Scanner;
public class Num_reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	 
		System.out.println("Enter a 5 digit number ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            int temp =0;
    		int sum =0;
    		int initial;
    		initial=num;
    		int r,reverse = 0;
    		for(int i =1;initial>0;i++) {
    			initial=initial/10;
    			temp++;
    		}
    		if(temp<5 || temp>5) {
    			System.out.println("Entered wrong number ");
    		}
    		else {			
    		    	while(num != 0)
    		    	{
    		        	r=num%10;
    		        	reverse=(reverse*10)+r;
    		        	num =num/10;
    		        	sum+=r;
    		    	}
    		    	System.out.println("Reverse number is ="+reverse);
    				System.out.println("Sum of the digit is ="+sum);
    		}
        } else {
            System.out.println("Error: Entered input is not an integer");
        }
		
		sc.close();
	}
}

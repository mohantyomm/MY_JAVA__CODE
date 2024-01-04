package random_question_given.com;
import java.util.Scanner;
public class fibonacci_series {
	public static int fibonacci(int num)
	{
	    if (num == 0)
	    {
	        return 0;
	    }
	    else if (num == 1)
	    {
	        return 1;
	    }
	    else
	    {
	        return (fibonacci(num - 1) + fibonacci(num - 2));
	    }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the num ");
		num = sc.nextInt();
		for(int i=0;i<=num;i++) {
			 System.out.println(fibonacci(i));
		}
		sc.close();
	}
}


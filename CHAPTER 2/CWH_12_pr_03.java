import java.util.Scanner;
public class CWH_12_pr_03 {
    public static void main(String[] args) {
        int number_given = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        float user_entered_number = sc.nextFloat();
        if(number_given >= user_entered_number)
        {
            System.out.println("the user entered number is less than the given number");
        }
        else
        {
            System.out.println("The user entered number is greater than the given number");
        }
        sc.close();
    }
}

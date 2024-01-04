import java.util.Scanner;
public class CWH_16_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int num = sc.nextInt();
        // int remainder = num%2;
        // if(remainder == 0)
        // {
        //     System.out.println("Entered number is even");
        // }
        // else
        // {
        //     System.out.println("Entered number is odd");
        // }
        System.out.println("Enter the age of the person : ");
        int age = sc.nextInt();
        if(age>= 18 && age <= 70)
        {
            System.out.println("Person is eligible for driving");
        }
        else
        {
            System.out.println("Person is not eligible for driving");
        }
        sc.close();
    }
}

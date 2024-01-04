import java.util.Scanner;

public class CWH_18_enhanced_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        int marks = sc.nextInt();
        switch(marks/10)
        {
            case 10  ->  { System.out.println("Your grade is O"); }
            case 9   ->  { System.out.println("Your Grade is O"); }
            case 8   ->  { System.out.println("Your Grade is E"); }
            case 7   ->  { System.out.println("Your Grade is A"); }
            case 6   ->  { System.out.println("Your Grade is B"); }
            case 5   ->  { System.out.println("Your Grade is C"); }
            case 4   ->  { System.out.println("Your Grade is D"); }
            default  ->  { System.out.println("You Failed In The Exam"); }
        }
        sc.close();
    }
}
// in this type of syntax of switch case we don't need to use break statement.
// Switch case can be operate on (number) as well as "String" and 'CHARACTER' ...
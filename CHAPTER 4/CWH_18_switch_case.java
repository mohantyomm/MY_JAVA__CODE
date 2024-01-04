import java.util.Scanner; 

public class CWH_18_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        int marks = sc.nextInt();
        switch(marks/10)
        {
            case 10:
            {
                System.out.println("Your grade is O");
                break;
            }
            case 9:
            {
                System.out.println("Your Grade is O");
                break;
            }
            case 8:
            {
                System.out.println("Your Grade is E");
                break;
            }
            case 7:
            {
                System.out.println("Your Grade is A");
                break;
            }
            case 6:
            {
                System.out.println("Your Grade is B");
                break;
            }
            case 5:
            {
                System.out.println("Your Grade is C");
                break;
            }
            case 4:
            {
                System.out.println("Your Grade is D");
                break;
            }
            default:
            {
                System.out.println("You Failed In The Exam");
                break;
            }
        }
        sc.close();
    }
}

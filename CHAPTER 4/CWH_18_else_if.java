import java.util.Scanner;

 
public class CWH_18_else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark: ");
        int mark = sc.nextInt();
        if(mark >=90)
        {
            System.out.println("Outstanding");
        }
        else if(mark >= 80 && mark <= 89)
        {
            System.out.println("Excellent");
        }
        else if(mark >= 70 && mark <= 79)
        {
            System.out.println("Amazing");
        }
        else if(mark >= 60 && mark <= 69)
        {
            System.out.println("Best");
        }
        else if(mark >= 50 && mark <= 59)
        {
            System.out.println("Good");
        }
        else if(mark >= 40 && mark <= 49)
        {
            System.out.println("Average");
        }
        else 
        {
            System.out.println("Failed");
        }
        sc.close();
    }
}

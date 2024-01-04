import java.util.Scanner;

 
public class CWH_19_pr05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if(year%400 == 0 ){
            System.out.format("  %d is a leap year",year);
        }
        else if(year%100 ==0)
        {
            System.out.format("  %d is not a leap year",year);
        }
        else if(year%4 == 0)
        {
            System.out.format("  %d is a leap year",year);
        }
        else 
        {
            System.out.format("  %d is not a leap year",year);
        }
        sc.close();
    }
}

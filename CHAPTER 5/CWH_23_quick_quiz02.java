import java.util.Scanner;
public class CWH_23_quick_quiz02{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i =num;i>0;i--)
        {
            System.out.println(i);
        }
        sc.close();
    }
}
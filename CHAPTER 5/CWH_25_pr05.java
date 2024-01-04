import java.util.Scanner;
public class CWH_25_pr05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the num : ");
        int num = sc.nextInt();
        int temp = 1;
        for(int i = 1;i <= num;i++)
        {
            temp = temp*i;
        }
        // int i = 1;//using while loop
        // while(i <= num)
        // {
        //     temp = temp*i;
        //     i++;
        // }
        System.out.format("The factorial of %d is %d",num,temp);
        sc.close();
    }
}

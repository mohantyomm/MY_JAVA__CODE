import java.util.Scanner;
public class CWH_25_pr02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = sc.nextInt();
        // int i = 0;
        // int temp =0;
        // while(i<=num){
        //     i++;
        //     if(i%2==0)
        //     {
        //        temp = temp + i; 
        //     }
        // }
        // System.out.println("The even number addition is "+temp);
        // for(int i =0;i<=num;i++)
        // {
        //     if(i%2==0)
        //     {
        //         temp = temp +i;
        //     }
        // }
        // System.out.println("The even number addition is "+temp);

        // Question - WAP to print sum of first n even number?
        int sum =0;
        for(int i =0;i<num;i++)
        {
            sum = sum + (2*i);
        }
        System.out.println("Sum of even number is "+sum);
        sc.close();
    }
}

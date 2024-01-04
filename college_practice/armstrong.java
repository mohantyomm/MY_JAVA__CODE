package college_practice;
import java.util.Scanner;
import java.lang.Math;
public class armstrong {
    public static void main(String[] args) {
        int num;
        int initial,remainder ,result=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the checking number");
        num = sc.nextInt();
        initial=num;
    while(num!=0)
    {
        remainder=num%10;
        result+=Math.pow(remainder,3);
        num/=10;
    }
    if(initial==result)
    {
        System.out.println("The entered number is a armstrong number");
    }
    else{
        System.out.println("The entered number is not a armstronng number");
    }
    sc.close();
    }
}

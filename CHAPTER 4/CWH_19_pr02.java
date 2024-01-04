import java.util.Scanner;
public class CWH_19_pr02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in math: ");
        float math = sc.nextFloat();
        System.out.println("Enter the marks in phy: ");
        float phy = sc.nextFloat();
        System.out.println("Enter the marks in chem: ");
        float chem = sc.nextFloat();
        float total = (math+phy+chem)/300*100;
         
        if(total >=40 && math >=33 && phy >= 33 && chem >= 33)
        {
            System.out.println("you are passed in the exam");
        }
        else
        {
            System.out.println("you failed in the exam");
        }
        System.out.println("your total pecentage is "+total+"%");
        sc.close();
    }
}

import java.util.Scanner;
public class CWH_19_pr03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tax = 0.0f;
        System.out.println("Enter your income");
        float income = sc.nextFloat();
        if(income < 250000){
                tax = tax+0;
        }
        else if(income>250000 && income<500000){
            tax = tax + 0.05f * (income - 250000);
        }
        else if(income>500000 && income<1000000){
            tax = tax + 0.2f*(income - 500000);
            tax = tax + (0.05f*250000);
        }
        else if(income > 1000000  ){
            tax = tax + 0.3f * (income - 1000000);
            tax = tax + (0.2f * 500000);
            tax = tax + (0.05f * 250000);
        }
        System.out.println(tax);
        sc.close();
    }
}

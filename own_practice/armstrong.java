package own_practice;

import java.util.Scanner;
import java.lang.Math;

public class armstrong {
    void function(int num) {
        int initial, remainder;
        int result = 0;
        initial = num;
        while (num != 0) {
            remainder = num % 10;

            result += Math.pow(remainder, 3);
            num /= 10;
        }
        if (initial == result) {
            System.out.println("The user entered number is Armstrong number");
        } else {
            System.out.println("The user entered number is not a Armstrong number");
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the armstrong checking number: ");
        num = sc.nextInt();
        armstrong obj = new armstrong();
        obj.function(num);
        sc.close();
    }

}
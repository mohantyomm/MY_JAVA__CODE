import java.util.Scanner;

public class CWH_23_quick_quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            // System.out.println(2*i + 1);this will also work if i = 0...
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}

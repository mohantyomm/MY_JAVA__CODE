import java.util.Scanner;

public class CWH_22_do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= num);
        sc.close();
    }
}
 
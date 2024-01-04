 import java.util.Scanner;


public class CWH_05_takinginp {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System .in);
        // System.out.println("Enter number1");
        // // int a = sc.nextInt();
        // float a =sc.nextFloat();
        // System.out.println("Enter number2");
        // int b = sc.nextInt();
        // float sum = a+b;
        // System.out.println("The sum of the two number is :");
        // System.out.println(sum);
        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);
        // String str =sc.next();we can use nextline for reading the total line
        // on behalf of  a single word.
        String str = sc.nextLine();
        System.out.println(str);
        sc.close();
    }
}

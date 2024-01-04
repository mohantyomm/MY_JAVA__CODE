import java.util.Scanner;
public class CWH_13_string {
    public static void main(String[] args) {
        // // String name = new String("Chiku");
        // String name = "chiku"; 
        // System.out.println(name);
        // int a = 4;
        // float b = 6.23f;
        // System.out.printf("The value of a is %d and the value of b is %f \n",a,b);
        // System.out.format("The value of a is %d and the value of b is %f \n",a,b);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        System.out.println("Hello : "+st);
        sc.close();
    }

}

import java.util.Scanner;
public class CWH_11_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of physics: ");
        int phy = sc.nextInt();
        System.out.println("Enter the marks of chemistry: ");
        int chem = sc.nextInt();
        System.out.println("Enter the marks of mathematics: ");
        int math = sc.nextInt();
        float percentage= ((phy + chem + math)/300.0f)*100;
        System.out.println("percentage : ");
        System.out.println(percentage);
        sc.close();
    }
}

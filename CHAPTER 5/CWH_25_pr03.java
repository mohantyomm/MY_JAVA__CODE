import java.util.Scanner;
public class CWH_25_pr03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        for(int i = 1;i<=10;i++)
        {
            result = num * i;
            System.out.println(num +"x"+ i +"="+ result);
        }
        sc.close();
    }
}

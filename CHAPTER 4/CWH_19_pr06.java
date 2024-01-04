import java.util.Scanner;
public class CWH_19_pr06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Website");
        String site = sc.nextLine();
         
        if( site.endsWith(".com")){
            System.out.println("Entered Website Is a commercial Website");
        }
        else if(site.endsWith(".org")){
            System.out.println("Enter Website is a Organisational Website");
        }
        else if(site.endsWith(".in")){
            System.out.println("Entered Website is a Indian Website");
        }
        else {
            System.out.println("Entered Website is not in our database");
        }
        sc.close();
    }
}

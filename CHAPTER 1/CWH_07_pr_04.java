import java.util.Scanner;
public class CWH_07_pr_04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the distance in kilometers");
    float distance = sc.nextFloat();
    
    float miles =distance*1.60934f;
    System.out.println("The Distance in miles is :"+miles +"miles");
    sc.close();
  }  
}
// q1-converting kilometer to miles.

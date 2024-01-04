package college_practice;
import java.util.Scanner;

 

public class greatest_integer {
   void greatest_value(int x,int y, int z)
   {
      if(x>y && x>z)
      {
         System.out.println("The value of a ="+x+" is bigger");
      }
      else if(y>x && y>z)
      {
         System.out.println("The value of b ="+y+" is bigger");
      }
      else 
      {
         System.out.println("The value of c ="+z+" is bigger");
      }
      }
      
   
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter the value of a :");
    a=sc.nextInt();
    System.out.println("Enter the value of b : ");
    b=sc.nextInt();
    System.out.println("Enter the value of the c : ");
    c=sc.nextInt();
   greatest_integer obj = new greatest_integer();
   obj.greatest_value(a, b, c);
   sc.close();
   }
}
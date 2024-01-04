import java.util.Scanner;
class rectangle{
float area(float L)
{
    return(L*L);
}
float perimeter(float L)
{
    return(4*L);
}
}
public class area_primeter{
    public static void main(String[] args) {
        float A,P;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A : ");
        A=sc.nextFloat();
        System.out.println("Enter the value of P");
        P=sc.nextFloat();
        rectangle obj = new rectangle();
        A=obj.area(A);
        P=obj.perimeter(P);
        System.out.println("Area = "+A);
        System.out.println("Perimeter = "+P);
        
        sc.close();
    }
}
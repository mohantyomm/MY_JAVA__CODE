package college_practice;

public class default_constructor {
    int a,b;
    default_constructor()
    {
        this.a=3;
        this.b=4;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        default_constructor obj= new default_constructor();
         
    }
}

package college_practice;
 
public class paramaterised_constructor{ 
    int i;
    String n;
    paramaterised_constructor(int a,String x)
    {
        i=a;
        n=x;
    }
    void display()
    {
        System.out.println(i+" "+n);
    }
    public static void main(String[] args) {
        paramaterised_constructor t1 = new paramaterised_constructor(1,"abc");
        paramaterised_constructor t2 = new paramaterised_constructor(2,"xyz");
        t1.display();
        t2.display();
    }
}

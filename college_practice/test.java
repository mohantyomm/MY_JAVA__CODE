package college_practice;
class student{
    int id;
    int age;
    String name;
    student (int a,String s)
    {
        id = a;
        name = s;

    }
    
    student(int i,String x,int b)
    {
        id = i;
        name = x;
        age = b;

    }
    void display()
    {
        System.out.println(id+""+name);
    }
    void display1()
    {
        System.out.println(id+""+name+""+age);
    }
}
class test
{
    public static void main(String[] args) {
        student obj = new student(2,"st");
        student obj1 = new student (3,"stk",5);
        obj.display();
        obj1.display1();
    }
}
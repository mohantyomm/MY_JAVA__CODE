package college_practice;
public class student {
    int rollno;
    String name;
    static String college = "GIET";

    student(int r, String n) {
        rollno = r;
        name = n;

    }

    void display() {
        System.out.println(rollno + "" + name + "" + college);

    }

    public static void main(String[]args)
            {
                student s1=new student(1,"babu");
                student s2=new student(2,"siba");
                s1.display();
                s2.display();         
    }
}

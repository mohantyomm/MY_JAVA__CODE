import java.util.Scanner;
public class CWH_06_exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks for subject 1:");
        float subject1=sc.nextFloat();
        System.out.println("Enter the marks for subject 2:");
        float subject2=sc.nextFloat();
        System.out.println("Enter the marks for subject 3:");
        float subject3=sc.nextFloat();
        System.out.println("Enter the marks for subject 4:");
        float subject4=sc.nextFloat();
        System.out.println("Enter the marks for subject 5:");
        float subject5=sc.nextFloat();
        int totalmark= 500;
        float totalsecuredmarks=subject1+subject2+subject3+subject4+subject5;
        float percentage = (totalsecuredmarks/totalmark)*100;
        System.out.println("The percentage of the student1 in exam is :");
        System.out.print(percentage);
        System.out.println("%");
        sc.close();

    }
}

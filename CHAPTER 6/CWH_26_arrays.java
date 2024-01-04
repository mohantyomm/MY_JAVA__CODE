import java.util.Scanner;
public class CWH_26_arrays {
    public static void main(String[] args) {
        /*  classroom of 500 students
        2 option
        1. create 500 variables
        2. create array of size 500
        */
        // int []marks = {56,75,87,54,89}; one type of initialize an array.
        Scanner sc = new Scanner(System.in);
        int [] marks=new int [5];
        for(int i = 0;i<5;i++)
        {
            System.out.printf("Enter the %d element in array",i);
            marks[i]=sc.nextInt();
        }
        for(int i = 0;i<5;i++)
        {
            System.out.println(marks[i]);
        }
        sc.close();
    }
}

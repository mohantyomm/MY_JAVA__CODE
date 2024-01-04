import java.util.Scanner;
public class CWH_28_multi_dim_arr{
    public static void main(String[] args){
        int students = 2;
        int subject = 3;
        int [][]marks = new int [students][subject];
        Scanner sc = new Scanner(System.in);
        for(int i =0 ;i<students;i++){
            for(int j = 0;j<subject;j++)
            {
                System.out.format("Enter the marks of student %d in subject %d :\n",i+1,j+1);
                marks[i][j]=sc.nextInt();
            }
        }
        for(int i =0 ;i<students;i++){
            for(int j = 0;j<subject;j++)
            {
                System.out.format("  The marks of student %d in subject %d : %d\n",i+1,j+1,marks[i][j]); 
            }
        }
        sc.close();
    }
} 

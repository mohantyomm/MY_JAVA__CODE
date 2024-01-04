public class CWH_29_pr03 {
    public static void main(String[] args) {
         float marks[]={56.2f,76.3f,82.4f,86.4f,78.3f};
         float sum =0;
         float avg;
         for(float element :marks)
         {
            sum+=element;
         }
         avg = sum/marks.length;
         System.out.println(avg);

    }
}
 
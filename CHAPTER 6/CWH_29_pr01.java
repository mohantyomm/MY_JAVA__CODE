public class CWH_29_pr01 {
    public static void main(String[] args) {
        float num[]={1.2f,2.3f,3.4f,4.5f,5.6f};
        float sum = 0;
        for(int i =0;i<num.length-1;i++)
        {
            sum +=num[i];
        }
        System.out.println("Sum of the total elements present in the array is "+sum);
    }
}

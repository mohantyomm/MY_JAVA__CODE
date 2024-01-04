public class CWH_25_pr06 {
    public static void main(String[] args) {
        int num = 2;
        int result = 0;
        int sum = 0;
        for(int i = 10;i>0;i--)
        {
            result = num * i;
            // System.out.format("%d x %d = %d \n",num,i,result);
            sum = sum +result;
        }
        System.out.println(sum);
    }
}

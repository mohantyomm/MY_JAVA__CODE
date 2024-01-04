public class CWH_29_pr06 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        int max =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("The maximum number present in the array is "+max);
    }
}

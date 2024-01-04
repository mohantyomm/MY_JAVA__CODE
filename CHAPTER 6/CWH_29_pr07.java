public class CWH_29_pr07 {
    public static void main(String[] args) {
        int []arr={9,8,7,6,5,4,3,32};
        int min =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("The minimum number present in the array is "+min);
    }
}
/*
 using for each loop.
 int min =Integer.MIN_VALUE;
 for(int e :arr)
 {
    if(e<min)
    {
        min=e;
    }
 }
 */
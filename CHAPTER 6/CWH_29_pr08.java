public class CWH_29_pr08 {
   public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8};
    boolean IsSorted = false;
    for(int i=0;i<arr.length-1;i++)
    {
        if(arr[i]>arr[i+1])
        {
            IsSorted = true;
            break;
        }
    }
    if(IsSorted)
    {
        System.out.println("Array is not sorted");
    }
    else
    {
        System.out.println("Array is sorted");
    }
   } 
}
// question to check whether the array is sorted or IsSorted

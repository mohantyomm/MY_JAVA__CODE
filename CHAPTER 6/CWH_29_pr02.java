public class CWH_29_pr02 {
    public static void main(String[]args){
        // int num =5;
        // int arr[]={1,2,3,4,5,6,7,8,9,10};
        // for(int i =0;i<arr.length-1;i++)
        // {
        //     if(arr[i]==num)
        //     {
        //         System.out.println("The number is present in the array. In the index of "+i);
        //     }
        // }
        int num =5;
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        boolean isInArray =false;
        for(int element : arr)
        {
            if(num==element)
            {
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("THE value is present in the array");
        }
        else
        {
            System.out.println("THe value is not present in the array");
        }
    }
}

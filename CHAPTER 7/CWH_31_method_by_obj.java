 public class CWH_31_method_by_obj {
  void reverse(int arr[],int size)
  {
     int temp;
     int n = Math.floorDiv(size, 2);
     for(int i =0;i<n;i++){
      temp = arr[i];
      arr[i]=arr[size-i-1];
      arr[size-i-1]=temp;
     }
     for(int i =0;i<size;i++){
     System.out.println(arr[i]);
     }
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    int size = arr.length;
    CWH_31_method_by_obj obj = new CWH_31_method_by_obj();
    obj.reverse(arr,size);
  } 
}
// This is done if the method is created without static.....
// IMPORTANT<.................>

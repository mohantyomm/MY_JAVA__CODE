import java.util.Scanner;
public class CWH_31_methods {
   void reverse(int arr[], int size) {
      int temp = 0;
      for (int i = 0; i < size; i++) {
         temp = arr[i];
         arr[i] = arr[size - i - 1];
         arr[size - i - 1] = temp;
      }
      for (int i = 0; i < size; i++) {
         System.out.println(arr[i]);
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int arr[] = new int[6];
      for (int i = 0; i < 6; i++) {
         System.out.println("Enter the array element of index" + (i + 1));
         arr[i] = sc.nextInt();
      }
      int size = arr.length;
      CWH_31_methods obj = new CWH_31_methods();
      obj.reverse(arr, size);
      sc.close();
   }
}

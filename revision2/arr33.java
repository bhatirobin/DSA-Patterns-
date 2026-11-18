import java.util.*;
import java.util.Arrays;

public class arr33 
{

    public static void reverse(int arr[])
         {
            int n = arr.length;

            for(int i=n-1; i>=0; i--)
            {
                System.out.print(arr[i]+", "+" ");
            }
         }
   public static void main(String[] args) 
   {
    Scanner sc = new Scanner(System.in);

        System.out.println("enter input the elements from in array");

        int arr[] = new int[5];

        for(int i=0; i<5; i++)
          {
            arr[i] = sc.nextInt();
          }
          reverse(arr);
    
   }    
}

import java.util.*;
public class printarray 
{
     
   public static void print(int arr[], int i)
   {
      if(i == arr.length)
      {
         return ;
      }
      print(arr, i+1);

      System.out.println( arr[i]);
   }
     public static void main(String args[])
     {
           int arr[] = {5,4,3,2,1};
           print(arr, 0);
     }
}

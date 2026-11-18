import java.util.*;
public class printarray2 
{
          public static void printarr(int arr[], int i)
          {
            if(i == arr.length)
            {
                return ;
            }
            System.out.println(arr[i]);

            printarr(arr, i+1);
          }
          public static void main(String args[])
          {
            int arr[] = { 7,8,9,10,11,12};
            printarr(arr, 0);
          }
}

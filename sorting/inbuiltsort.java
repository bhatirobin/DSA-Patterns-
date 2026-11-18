import java.util.*;
import java.util.Arrays;
public class inbuiltsort {
  /*   public static void printArr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }8*/

 public static void main(String args[]) {
    Integer arr[] = {5,4,1,3,2};
    for(int i=0; i<arr.length; i++)
    {
        Arrays.sort(arr);
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    
 //   Arrays.sort(arr);
   // printArr(arr);
    
   

    
 }   
}

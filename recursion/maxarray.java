import java.util.*;
public class maxarray 
{
    public static int maxarr(int arr[], int i)
    {
        if(i == arr.length-1)
        {
            return arr[i];
        
        }
       int max = maxarr(arr, i+1);
        
       return Math.max(arr[i],max);

    }

    public static void main(String args[])
    {
        
        int arr[] = {7,88,34,52,63,13,39};

      //  maxarr(arr, 0);
      System.out.println(maxarr(arr, 0));
    }
    
}

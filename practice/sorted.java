import java.util.*;
public class sorted 
{
    public static boolean sorted(int arr[], int i)
        {
            if(i == arr.length-1)
            {
                return true;
            }
            if(arr[i] != arr[i+1])
            {
                return false;
            }
            return sorted(arr, i+1);
        }
    public static void main(String args[])
    {
        int arr[] ={5,4,7,2,1}; 
        
       // sorted(arr, 0);
       System.out.println(sorted(arr, 0));
    
    }
    
}

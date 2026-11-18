import java.util.*;
public class sumarray2 
{
    public static int sum(int arr[], int i)
    {
        if(i == arr.length-1)
        {
            return arr[i];
        }
        int robin = sum(arr, i+1);
        return robin + arr[i];
    }
    public static void main(String args[])
    {
        int arr[] = {8,9,23,21};

        System.out.println(sum(arr, 0));
    }
    
}

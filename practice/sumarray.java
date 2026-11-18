import java.util.*;
public class sumarray 
{

    public static int sum(int arr[], int i)
    {
        if(i == arr.length)
        {
            return 0;
        }
        int suma = sum(arr, i+1);

        return arr[i]+suma;
    }
    public static void main(String args[])
    {
       
        int arr[] = {1,4,3,8,6};
        System.out.println(sum(arr, 0));
    }
    
}

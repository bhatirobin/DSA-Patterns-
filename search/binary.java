import java.util.*;
public class binary
{   //using recursion
    static boolean binary(int arr[], int s, int end, int key)
    {
        if(s <= end)
        {
            return false;
        }

        int mid = (s+end)/2;
        if(arr[mid] == key)
        {
            return true;
        }
        else
        if(key < arr[mid])
        {
            return binary(arr, s, mid-1, key);
        }
        return binary(arr, mid+1, end, key);
        
        
        

    }
    public static void main(String args[])
        {
            int arr[] ={9,3,5,7,2,6,4,8,1};

            System.out.print(binary(arr, 0, arr.length-1, 6));
        }
    
}

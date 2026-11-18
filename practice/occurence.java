import java.util.*;
public class occurence 
{
    public static int occurence(int arr[], int i, int key)
    {
        if(i == arr.length)
        {
            return 0;
        }
        if(arr[i] == key)
        {
            System.out.println(i+" ");
        }
    //    return occurence(arr, i+1, key);
      //  System.out.println(i+" ");
        return occurence(arr, i+1, key);
    }
    public static void main(String args[])
    {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        
        System.out.println(occurence(arr, 0, 2));

    }
    
}

import java.util.*;
public class insertion2 
{
    static void insert(int arr[])
    {
        int r = arr.length;

        for(int i=0; i<r; i++)
        {
            int j = i;
            while(j>0 && arr[j] < arr[j-1])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                 j--;
            }
        }
    }
    public static void main(String args[])
    {
        int arr[] = {45,12,89,11,4,6,1,9,5,3,8};

        //function calling 
        insert(arr);

        //print the sorted array by using insertion sorting 

        for(int i: arr)
        {
            System.out.print(i+" ");
        }
    }
    
}

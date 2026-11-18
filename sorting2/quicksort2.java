import java.util.*;
public class quicksort2 
{
    static void quicksort(int arr[], int s, int e)
    {
         if(s > e)
         {
            return;
         }
         int part = partation(arr, s, e);

         quicksort(arr, s, part-1);
         quicksort(arr, part+1, e);
    }
    static int partation(int arr[], int s, int e)
    {
        int pivot = arr[e];

        int i= s-1;

        for(int j=1; j<e; j++)
        {
            if(arr[j] <= arr[pivot])
            {
                i++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                
            }
        }
        i++;

        int temp = pivot;

        arr[e] = arr[i];

        arr[i] = temp;

        return i;

    }
    public static void main(String args[])
    {
       int arr[] ={3,8,5,14,67,11,7,6};

     //   int arr[] = {6,3,9,8,2,5};

        partation(arr, 0, arr.length-1);

        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    
}

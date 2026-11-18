import java.util.*;
public class quicksort 
{
    static void quicksort(int arr[], int s, int e)
        {
           if(s > e) return;
           
           int part = partation(arr, s, e);
           
           quicksort(arr, s,part-1);//it is the end of the itreation
           quicksort(arr, part+1, e);//it is make for the start for index seze value


        }
        static int partation(int arr[], int s, int e )
        {
            int pivot = arr[e];

            int i = s-1;

            for(int j=s; j<e; j++)
            {
                if(arr[j] <= arr[pivot])
                {
                    //it is element swaped less then pivot
                    i++;

                    int temp = arr[j];

                    arr[j] = arr[i];

                    arr[i] = temp;

                }
            }
            i++;

            int temp = pivot;

            arr[pivot] = arr[i];

            arr[i] = temp;
            return i;
            
        }
    public static void main(String args[])
    {
        int arr[] = {6,3,9,8,2,5};

      //  int arr[] ={7,4,8,9,3,5};

            //quicksort(arr, 0, arr.length-1);

            partation(arr, 0, arr.length-1);

            for(int i:arr)
            {
                System.out.print(i+" ");
            }

    }
    
}

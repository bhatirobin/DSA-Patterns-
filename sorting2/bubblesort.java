import java.util.*;
public class bubblesort
{
    static void bubble(int arr[])
    {
        //here are store in single word variable for the array and array length
        int n = arr.length;
       
        //here are create the inner loop use run time itreation
        for(int i=0; i<n; i++)
        {
            //here are the create the outer loop to adjusting
            //the element and comparing and after then swapping 
            //in this work are take this loop
            for(int j=0; j<n-i-1; j++)
            {
                //here are the check the element are sorted or not 
                //after then swapping
                if(arr[j]> arr[j+1])
                {
                    //or agr element sorted nhi hai to values ko swap kr do
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] ={8,4,9,6,2,3,1,5};

        bubble(arr);

        //for check the array are sorted or not 
        for(int i : arr)
        {
            System.out.print(i+" ");
        }

    }

}
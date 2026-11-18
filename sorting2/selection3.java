import java.util.*;
public class selection3
{
    static void selection(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            int min = i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j] < arr[min])
                    {
                        min = j;
                    }

            }
                    int temp = arr[i];

                    arr[i] = arr[min];

                    arr[min] = temp;
                
            
        }
    }
    public static void main(String args[])
        {
        
          int arr[] = {25,12,18,3,9,8,1,24,16};

            // function calling
            selection(arr);

            for(int i: arr)
            {
                System.out.print(i+" ");
            }
    

        }
}
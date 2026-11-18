import java.util.*;
public class selection4 
{
    static void select(int arr[])
    {
        int a = arr.length;
        for(int i=0; i<a-1; i++)
        {

            int m = i;
            for(int j=i+1; j<a; j++)
            {
                if(arr[j] < arr[m])
                {
                    m = j;
                }
            }
            int  temp = arr[i];

            arr[i] = arr[m];

            arr[m] = temp;
        }
    }
    public static void main(String args[])
    {
          int arr[] = {5,9,12,41,1,54,61,2,18,3,46};

          //function calling 

          select(arr);

          //in his print for the sorted array
          for(int i: arr)
          {
            System.out.print(i+" ");
          }
    }
    
}

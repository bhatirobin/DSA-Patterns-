import java.util.*;
public class bubblesort2 
{
    static void bubblesort(int arr[])
    {
        int n = arr.length;
//n-1 pr vahi code chlega or <n pr bhi vahi code chlega
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
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

        int arr[] = {12,16,14,32,53,46,67};
        bubblesort(arr);
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
    
}

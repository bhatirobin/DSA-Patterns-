import java.util.*;
public class set0 
{
    static void zeroset(int arr[])
        {
            int n= arr.length;

            for(int i=0; i<n; i++)
            {

                for(int j=0; j<n-i-1; j++)
                {
                    if(arr[j] == 0 && arr[j+1] != 0)
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
            int arr[] = {0,5,0,3,42};

            zeroset(arr);

            for(int i:arr)
            {
                System.out.print(i+" ");
            }
    }
    
}

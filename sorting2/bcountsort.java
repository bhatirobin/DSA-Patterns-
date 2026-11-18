import java.util.*;
public class bcountsort 
{

    static int findmax(int arr[])
        {
            int max = Integer.MIN_VALUE;

            for(int i=0; i<arr.length; i++)
            {
                if(arr[i] > max)
                {
                    max = arr[i];
                }
            }
            return max;
        }

        static void basiccount(int arr[])
        {
            int max = findmax(arr);

            int count[] = new int[max+1];

            for(int i=0; i<arr.length; i++)
            {
                count[arr[i]]++;

            }
            int k = 0;

            for(int i=0; i<count.length; i++)
                {
                    for(int j=0; j<count[i]; j++)
                    {
                        arr[k++] = i;
                    }
                }
        }
    public static void main(String args[])
        {
            int arr[] = {2,6,3,4,2,3,4,6};

            //System.out.println(findmax(arr));

            basiccount(arr);
            for(int i: arr)
            {
                System.out.print(i+" ");
            }


        }
    
}

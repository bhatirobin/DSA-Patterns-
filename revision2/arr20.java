import java.util.*;
public class arr20 
{
    public static int greater(int arr[], int key)
    {
         int count = 0;

         for(int i=0; i<arr.length; i++)
         {
            if(key > arr[i])
            {
                count++;
            }
         }

         System.out.println("count greater is this = "+ count);

         return count;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {4,5,9,5,8,1,2,7};

        greater(arr, 6);
        


        
    }
    
}

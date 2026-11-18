import java.util.*;
import java.util.Arrays;
public class arr30 
{

      public static int repeating2(int arr[])
        {
            int n = arr.length;

            for(int i=0; i<n; i++)
               {
                  for(int j=i+1; j<n; j++)
                    {
                          if(arr[j] == arr[i])
                            {
                            
                                return arr[i];
                            }
                    }
               }
               return -1;
        }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the elements form in array");

        int arr[] = new int[7];

        for(int i=0; i<7; i++)
        {
            arr[i] = sc.nextInt();
        }

        repeating2(arr);
        
    }
    
}

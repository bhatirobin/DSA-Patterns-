import java.util.*;
import java.util.Arrays;
public class arr28 
{
    
       public static int largest2(int arr[])
       {
           int max = Integer.MIN_VALUE;
           for(int i=0; i<arr.length; i++)
               {
                   if(max < arr[i])

                   {
                       max = arr[i];
                    }
               }

               System.out.println("maximum is this ="+ max);

               return max;
       }

           public static int secondmax(int arr[])
              {
                int max = largest2(arr);

                for(int i=0; i<arr.length; i++)
                {
                    if(arr[i] == max)
                    {
                        arr[i] = Integer.MIN_VALUE;
                    }
                }
                  int smax = largest2(arr);
                  
                  return smax;
              }
    public static void main(String[] args) 
    {
        Scanner sc  = new Scanner(System.in);

        System.out.println("enter input from the array");

        int arr[] = new int[7];

        for(int i=0; i<7; i++)
        {
            arr[i] = sc.nextInt();
        }


        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.print("second maximum element is ="+largest2(arr));
        
        System.out.println("second max number ="+secondmax(arr));
    }
    
}

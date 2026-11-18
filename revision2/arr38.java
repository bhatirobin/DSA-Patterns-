import java.util.*;
import java.util.Arrays;
public class arr38 
{

     public static void count(int arr[])
     {
        int n=arr.length;
        int key = 0;
        int count =0;
        for(int i=0; i<n; i++)
          {
              if(key == arr[i])
              {
                count++;
              }
  
          }
          for(int i=0; i<n; i++)
            {
                if(i < count)
                {
                    arr[i] = 0;
                }else
                {
                    arr[i] = 1;
                }
            }
     }
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);

      System.out.println("enter input elements from in array");

       int arr[] = new int[9];
       for(int i=0; i<9; i++)
          {
            arr[i] = sc.nextInt();
          }
            count(arr);

            System.out.println("print sorted array");

             count(arr);
        }
    
}

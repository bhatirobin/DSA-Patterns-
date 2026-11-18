import java.util.*;
import java.util.Arrays;
public class arr34 
{
    public static void checkprestent(int arr[], int a)
    {
        int n = arr.length;

        for(int i=0; i<n; i++)
        {
            if(arr[i] == a)
            {
                System.out.println("the element a is present in array");
            }
           // else
            //{
                
          //  }
        }
        System.out.println("element are not present in array");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

System.out.println("enter the element to check in array in present or not");

   int a = sc.nextInt();
       

        System.out.println("enter the input elements from in array");

        int arr[] = new int[7];

        for(int i=0; i<7; i++)
           {
            arr[i] = sc.nextInt();
           }

         //  System.out.println("input for check in array");

         //  int a = sc.nextInt();
            
           //function calling

           checkprestent(arr, a);


    }
    
}

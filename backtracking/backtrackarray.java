import java.util.*;
public class backtrackarray 
{

    //here are rou print the array in the real value index
    static void printarray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void changearray(int arr[],int i,int value)
        {

            //here are you create the base case;
            if(i == arr.length)
            {
                printarray(arr);
                return;
            }
            //here we are make the recursive function
            arr[i] = value;
              //it is a function call in recursion
            changearray(arr, i+1, value+3);
               //this make opreation is backtracking
            arr[i] = arr[i] -2;
        }
       public static void main(String args[])
       {
        int arr[] = new int[5];

         changearray(arr, 0, 4);
         printarray(arr);


       }
}

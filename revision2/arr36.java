import java.util.*;
import java.util.Arrays;
public class arr36 
{

    static void swaparray(int arr[],int i ,int j)
       {
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
       }
    static void reverse(int arr[])
      {
        int i=0, j = arr.length;
    
        while(i < j)
        {
            swaparray(arr , i , j);
              i++;
              j--;
        }
        
          
      }
    public static void main(String[] args) 
    {
        int arr[] ={1,2,3,4,5,6};

      reverse(arr);
        
    }
    
}

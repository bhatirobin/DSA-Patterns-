import java.util.*;
public class practice2 {
    public static void bubble(int arr[])
    {
        int temp;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]= temp;
                }
                System.out.print(arr[j]+" ");
            }
           // System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] ={3,6,2,1,8,7,4,5,3,1};
        bubble(arr);
        
    }
    
}

import java.util.*;
public class practice3 {
    public static void bubble(int arr[])
    {
        int temp;
        for(int i=0; i<arr.length; i++)
        {
            int flag=0;
            for(int j=0; j<arr.length-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]= temp;
                    flag=1;
                }
               // System.out.print(arr[j]+" ");
            }
            if(flag==0)
            {
                break;
            }
            
           // System.out.println();
        }
        for(int i=0; i<arr.length; i++)
            {
                System.out.print(arr[i]+" ");
            }

        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] ={3,6,2,1,8,7,4,5,3,1};
        bubble(arr);
        
    }
    
}

    
    


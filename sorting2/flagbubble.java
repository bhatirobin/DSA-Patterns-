import java.util.*;
public class flagbubble 
{
    static void bubble(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            boolean flag = false;//some swap has happened
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true; //some swap has happened
                    //or flag true hai to element swap hue hai
                }
            }
            if(flag == false) return;//agr flag false hai to koi element swap hi nhi hua 
        
        }
    }  
    public static void main(String args[])
    {
        int arr[]= {2,1,3,4,5};
        bubble(arr);
        for(int i : arr)
        {
            
            System.out.print(i+" ");
        }
    }
    
}

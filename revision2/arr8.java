import java.util.*;
public class arr8 
{
    static void max()
    {
        int max =Integer.MIN_VALUE;
        int arr[] = {1,5,6,8,85,45,12,75};

        for(int i=0; i<arr.length; i++)
        {
            if( max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("maximum value is this="+max);
    }
    public static void main(String[] args) 
    {
         max();
        
    }
    
}

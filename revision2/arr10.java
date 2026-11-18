import java.util.*;
public class arr10 
{
    public static int keyfound(int key)
    {
        int ans = -1;
        int arr[] ={45,64,63,841,16,46,63,54,87};

        for(int  i=1; i<arr.length; i++ )
        {
            if(arr[i] == key) 
            {
                key = i;
            }
           
            
        }
        System.out.println("key last index="+ key);

        return key;

    
    }
    public static void main(String[] args) 
    {
        keyfound(63);
        
    }
    
}

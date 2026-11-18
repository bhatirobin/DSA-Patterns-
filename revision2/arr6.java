import java.util.*;
public class arr6 
{
    static void sumarr()
    {
        int sum = 0;
        int arr[] ={4,6,8,2,9,7,5,3,1};

        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];

           // System.out.println(sum);
        }
         System.out.println(sum);

    }
    public static void main(String[] args) 
    {

         sumarr();        
    }
    
}

import java.util.*;
public class sumarray 
{ 

    public static int sumarr(int arr[], int i)
    {
        if(i == arr.length-1)
        {
            return arr[i];
        }
        //here are the creating for small / recursive work
        int suma =sumarr(arr, i+1);
        //here are make the self work 
          int add = arr[i]+suma;
        return add;


    }
     public static void main(String args[])
        {
            int arr[] = {4,5,7,6,9,3};
            System.out.println(sumarr(arr, 0));
        }
}

import java.util.*;
public class maxvaluearray 
{
    public static int maxvalue(int arr[],int i)

        {
            if(i == arr.length-1)
            {
                return arr[i];

            }
            int s =maxvalue(arr, i+1);
            return Math.max(arr[i],s);
        }
    public static void main(String args[])
        {
            int arr[] = {56,28,72,62,25,42,98,69,68,79};

            System.out.println(maxvalue(arr, 0));

        }   
}

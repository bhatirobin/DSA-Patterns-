import java.util.*;
public class practice1 {
    public static void insertion(int arr[])
    {
        int temp;
        int j;
        for(int i=0; i<arr.length; i++)
        {
            temp =arr[i];
            j=i;
            while(j>0 && arr[j-1]>temp)
            {
                arr[j]= arr[j-1];
                j =j-1;
            }
            arr[j] =temp;
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
            insertion(arr);
    }
    
}

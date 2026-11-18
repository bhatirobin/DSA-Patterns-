import java.util.*;
public class reversearray
{
    static void printarray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
        System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void changevalues(int arr[], int i, int value)
    {
        if(i == arr.length)
        {
             printarray(arr);
             return;
        }
             changevalues(arr, i+1, value+1);
        arr[i] = arr[i]-2;
    }
    public static void main(String args[])
    {
        int arr[] = {12,9,5,4,7};
    //  Scanner sc = new Scanner(System.in);
     //   int arr[] = new int[5];
    
        changevalues(arr, 0, 0);
        printarray(arr);
    }

}
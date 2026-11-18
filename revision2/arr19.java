import java.util.*;
public class arr19 
{

    static int lastoccurence(int arr[], int key)
    {
        int lastindex = -1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == key )
            {
                lastindex = i;
            }
        }
       // System.out.println("key at last index is this="+lastindex);
         return lastindex;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the key value");

        int key = sc.nextInt();

        int arr[] = {2,5,6,5,9,4,5,8,5,7,9};

        // System.out.println("enter the input of an array elements");

        // int arr[] = new int[8];

        // for(int i=0; i<8; i++)
        // {
        //     arr[i] = sc.nextInt();

        // }
       // int key = sc.nextInt();
        
        lastoccurence(arr, 0);
    }
    
}

import java.util.*;
public class firstoccurence 
{
    public static int foccurence(int arr[], int i, int key)
    {
        if(i == arr.length)
        {
            return -1;
        }
        if(arr[i] == key)
        {
            return i;
        }
        int n = foccurence(arr, i+1, key);
        return n;
    }
    public static void main(String args[])
            {
                 int arr[] = {8,4,7,9,1,3,5,3};
                 System.out.print("the key index dound index is this:-");
                 System.out.println(foccurence(arr, 0, 3));
            }
    
}

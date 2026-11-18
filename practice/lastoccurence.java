import java.util.*;
public class lastoccurence 
{
    public static int loccurence(int arr[], int i, int key)
        {
            if(i == arr.length)
            {
                return -1;
            }
            int found = loccurence(arr, i+1, key);
            if(found == -1 && arr[i] == key)
            {
                return i;
            }
            return found;
        }
     public static void main(String args[])
     {

         int arr[] = {9,6,3,5,3,1,2,4,3,9,54,43};
         System.out.print("Find the last index for a s key value :-");
         System.out.println(loccurence(arr, 0, 3));


     }
     
}

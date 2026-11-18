import java.util.*;
public class bsearch2
{
    static boolean binary(int arr[], int key)
            {
                int n = arr.length;

                int s = 0, end =n-1;

                while(s < end)
                {
                    int mid = (s + end)/2;

                    if(arr[mid] == key)
                    {
                        return true ;
                    }
                    else
                    if(arr[mid] < key)
                    {
                        end = mid-1;
                    }
                    else
                    {
                        s = mid+1;
                    }
                }
                return false;
            }
    public static void main(String args[])
        {
            int arr[] = {12,45,68,49,1,7,4,2,9,3,16,75,46,42};

          //  binary(arr, 46);


         /*  int key = 0;
            //method 1
              // System.out.println(binary(arr, 46));
            

               // method 2
               while(key != 10)
               {
                System.out.printf("%d exist in array : %b \n",key,binary(arr, 0));
                key++;
               }*/
        }

}

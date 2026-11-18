import java.util.*;
public class setstring 
{
    static void sortstring(String arr[])    
                {
                    
                    for(int i=0; i<arr.length; i++)
                    {
                        int min = i;

                        for(int j=i+1; j<arr.length; j++ )
                        {
                            if(arr[j].compareTo(arr[min]) < 0)
                            {
                                min = j;
                            }
                        }
                        String temp = arr[i];

                        arr[i] = arr[min];

                        arr[min] = temp;

                    }

                }
   public static void main(String args[])
    {
       String arr[] ={"papaya", "lime", "watermelon","apple","mango", "kiwi"};
   
   sortstring(arr);

   for(String i:arr)
   {
    System.out.print(i+" ");
   }
   
    }    
}

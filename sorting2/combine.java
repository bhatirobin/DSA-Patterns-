import java.util.*;
public class combine 
{
    static void bubble(int arr[])
    {
        int s = arr.length;
        for(int i=0; i<s; i++)
        {
            for(int j=0; j<s-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];

                    arr[j] = arr[j+1];

                    arr[j+1] = temp;
                }
            }
        }
    }

    static void bublle2(int vrr[])
    {
        int r= vrr.length;

        for(int i=0; i<r; i++)
        {
            boolean flag = false;
            for(int j=0; j<r-i-1; j++)
            {
                if(vrr[j] > vrr[j+1])
                {
                    int temp = vrr[j];

                    vrr[j] = vrr[j+1];

                    vrr[j+1] = temp;

                    flag = true;
                }
            }
            if(flag == false) return;
        }
    }

    static void selection(int rvv[])
    {
        int v = rvv.length;

        for(int c=0; c<v; c++)
        {
            int min = c;

            for(int j=c+1; j<v; j++)
            {
                if(rvv[j] < rvv[min])
                {
                    min = j;
                }
            }
            int temp = rvv[c];
            
            rvv[c] = rvv[min];

            rvv[min] = temp;

        }
    }

    static void insertion(int rvr[])
    {
        int a = rvr.length;

       /*  for(int r=0; r<a; r++)
        {
            int j = r;

            if(j>0 && rvr[j] < rvr[j-1])
            {
                int temp = rvr[j];

                rvr[j] = rvr[j-1];

                rvr[j-1] = temp;

                j--;
            }
        }*/

        for(int i=0; i<a-1; i++)
        {
            int j=i;

            while( j>0 && rvr[j] < rvr[j-1])
            {
                int temp = rvr[j];

                rvr[j] = rvr[j-1];

                rvr[j-1] = temp;

                j--;
            }
        }
    }
     public static void main(String args[])
        {
            int arr[] ={5,8,9,3,7,2,4,1};

            // here are the first function call
           // bubble(arr);

            //print the first function
            //for(int i: arr)
           // {
          //      System.out.print(i+" ");
           // }

            int vrr[] = {14,11,18,15,19,13,16,17};

            //function calling for bubblesort2 

        //    bublle2(vrr);

            //print the sorted array bu bubble sort second method 
            // for(int i:vrr)
        //     {
          //      System.out.print(i+" ");
            // }
            int rvv[] = {25,21,29,22,28,23,27,24,26};

            //function calling 
            //selection(rvv);

            //print the sorted array using selection sort 

         //   for(int i: rvv)
         //   {
         //       System.out.print(i+" ");
         //   }

            int rvr[] = {36,31,35,32,39,33,38,34,37}; 
            //function calling for the insertion sort

            insertion(rvr);

            //print the sorted array by using insertion sorting 
            for(int i:rvr)
            {
                System.out.print(i+" ");
            }
        }

}

import java.util.*;
public class mergesort
{
    static void merge(int arr[],int l,int r,int mid )
    {
        int n1 = mid-l+1;
        int n2 = r-mid;

          int left[] = new int[n1];

          int right[] = new int[n2];

           int k;

          for(int i=0; i<n1; i++)
           {
             left[i] = arr[l+1];
                for(int j=0; j<n2; j++) 
               {
                    right[j] = arr[mid+1+l]

                    i = 0;
                    j = 0;
                    k = l;

                    while(i < n1 && j < n2)
                    {
                        if(left[i] < right[j++])
                        {
                            arr[k++] = left[i++];
                        }
                        else{
                            arr[k++] = right[j++];
                        }
                        
                    }
                    while(i < n1)
                    
                        arr[k++] = left[i++];
                    
                        while(j < n2)
                           
                         arr[k++] = right[j++];

               }
           }


    }
    static void display(int arr[])
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }

    }
    static void sortmerge(int arr[], int l, int r)
    {
        if(l > r)
        {
            return;
        }
        int mid = (l+r)/2;

        sortmerge(arr, l, mid);

        sortmerge (arr, mid+1, r);

         merge(arr, l, r, mid);
    }
    public static void main(String args[])
        {
            int arr[] = {9,3,5,8,2,7,1,4};

            int n = arr.length;

            System.out.println("array before sorting :-");

            //display(arr);

            System.out.print("array after sorting :-");

            merge(arr, n, n, n);
        sortmerge(arr, n, n);

        }

}

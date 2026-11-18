import java.util.*;
   public class bubblesort
   {
    public static void bubble(int a[])
    {
        int temp;
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a.length-1; j++)
            {
                if(a[j] > a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
                System.out.print(a[j]+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]) {
      //  Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
       // int[] a = new int[n];
        int a[] = {8,6,3,7,2,1,9};

        bubble(a);
        
    }
   }
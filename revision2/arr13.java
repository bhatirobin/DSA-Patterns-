import java.util.*;
public class arr13 
{
    static void print(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

            //  arr[0] = 1;
            //  arr[1] = 3;
            //  arr[2] = 5;
            //  arr[3] = 7;
            //  arr[4] = 9;

            for(int i=0; i<arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }

            //  System.out.println("enter the original array elements=");

            //  for(int i:arr)
            //  {
            //     System.out.print(i+" ");
            //  }

            //  System.out.println();

              int arr2[] = arr;

            //  arr[0] = 0;
            //  arr[2] = 65;

            //  System.out.println("this is a copy array elements");
            //  for(int ar2: arr2)
            //  {
            //    // System.out.println("this is a copy array elements");
            //     System.out.print(ar2+" ");
            //  }
           System.out.println("this is a original array elements");
            print(arr);
           System.out.println();

           System.out.println("print the second array elements");
            print(arr2);

            arr[0] = 00;
            arr[2] = 100;
            System.out.println("after changing first");
              print(arr);
             System.out.println("after changing second array");
            print(arr2);
    }
    
}

import java.util.*;
public class printsubarray {
    public static void printsub(int num[])
    {
        // int total = 0 mtlb total subarrays ko count krne ke liye 
        int total=0;
        for(int i=0; i<num.length; i++)
        {
            int start =i;
            for(int j=i; j<num.length; j++)
            {
                int end = j;
                for(int k=start; k<=end; k++)
                {
                    System.out.print(num[k] + " ");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("totalsubarrays is = " + total);
    }
    public static void main(String args[]) {
        int num[] ={ 2,4,6,7,8,9,18};
        printsub(num);
        
    }
    
}

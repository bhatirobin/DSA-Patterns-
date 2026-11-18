import java.util.*;
class main{
   
    public static void maxsubarr(int n[])
    {
        int currsum =0;
        int maxsum =Integer.MIN_VALUE;
        //int total =0;
        for(int i=0; i<n.length; i++)
        {
            int start =i;
            for(int j=i; j<n.length; j++)
            {
                int end = j;
                 currsum =0;
                for(int k=start; k<=end;k++)
                {
                   // System.out.println("number is " + n[k]);
                   currsum +=n[k];
                }
                System.out.println(currsum);
                if(maxsum < currsum)
                {
                    maxsum = currsum;
                }
               // total++;
            }     
           
        }
        System.out.println("maxsum = " + maxsum);
       // System.out.println("print total number" + total);
        
    }
    public static void main(String args[]) {
        int m[] = {1,-2,6,-1,3};
        maxsubarr(m);
        
    }
   }
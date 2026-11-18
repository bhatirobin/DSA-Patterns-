import java.util.*;
public class bubblesort2 {
    public static void bubblesort2(int n[])
    {
        int temp;
        for(int i=0; i<n.length; i++)
        {
            for(int j=0; j<n.length-1-i; j++)
            {
                if(n[j]>n[j+1])
                {
                    temp = n[j];
                     n[j] = n[j+1];
                     n[j+1] = temp; 
                }
               System.out.print(n[j] + " ");
            
            }
           // System.out.print(n[j] + " ");
          // System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[])
    {
            int n[] ={8,3,7,2,4,1,6};
            bubblesort2(n);
    }
    
}

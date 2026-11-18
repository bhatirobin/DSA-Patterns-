import java.util.*;
public class stringsort {
    public static void main(String[] args) {
        String[] n ={"robin", "amit", "rishab"};
        String temp;
        for(int i=0; i<n.length; i++)
        {
            int flag =0;
            for(int j=0; j<n.length-1-i; j++)
            {
                if(n[j].compareTo(n[j+1])>0)
                {
                    temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                    flag=1;
                }
            }
            if(flag==0)
        {
            
            break;
        }
     //   for(int i=0; i<n.length; i++)
       // {
        //    System.out.println(n[i]);
        
        }
        for(int i=0; i<n.length; i++)
        {
            System.out.println(n[i]);
        }
    }

    }
    


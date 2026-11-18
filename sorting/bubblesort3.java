import java.util.*;
public class bubblesort3 {
    public static void bubble3(int n[])
    {
        int temp;
        for(int i=0; i<n.length; i++)
        {
            int flag =0;
            for(int j=0; j<n.length-1-i; j++)
            {
                if(n[j]>n[j+1])
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
    public static void main(String args[])
{
    int n[] = {5,1,2,4,3};
    bubble3(n);

}    
}

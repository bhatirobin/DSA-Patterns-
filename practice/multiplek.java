import java.util.*;
public class multiplek 
{
    public static void multiple(int n, int k)
    {
        if(k == 1)
        {
            System.err.println(k);
            return ;
        }
        multiple(n, k-1);
        System.out.println(n*k);
       
        
        
    }
    public static void main(String args[])
    {
        
        multiple(12, 5);
    }
    
}

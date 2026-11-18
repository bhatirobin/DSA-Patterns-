import java.util.*;
public class findsum {
      
    
    public static int   sum(int n)  //here are make a bigger problem
    {
        if(n == 0)
        {
           return n;
        }
        //here are make soluatin the recursive problem in this program
        sum(n-1);

        //now this this is self work in here by using recursion program
        //System.out.println(sum(n-1)+ n;);

        int sumd = sum(n-1)+n;
     
        // print sum
        System.out.println(sumd);
    return sumd;
    } 
    public static void main(String args[])
    {
           sum(5);
    }
    
}

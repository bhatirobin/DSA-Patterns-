import java.util.*;
public class evenodd {

       public static void oddeven(int n)
       {
        int bitmask=1;
        if((n & bitmask) == 0)
        {
            //even
            System.out.println("number is even ");
        }
        else{
            //odd
            System.out.println("number is odd");
        }
       }
    public static void main(String args[])
    {
        oddeven(11);
        oddeven(16);

    }
    
}

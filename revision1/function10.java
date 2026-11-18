import java.util.*;
public class function10 
{
    public static void binary(int b)
    {
        int pow = 0;
        int decnum = 0;

        while(b > 0)
        {
            int l = b % 10;
            decnum = decnum + (l * pow);
            pow++;
            b = b/10;

            System.out.println(decnum);

        }
    }
    public static void main(String[] args) 
    {
   binary(10110);
        
    }
    
}

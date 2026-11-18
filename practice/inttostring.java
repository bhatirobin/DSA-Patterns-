import java.util.*;
public class inttostring 
{
    public static int inttostring(int n)
    {
        if(n>0 && n<10)
        {
            return n;
        }
        System.out.println(n+"one"+"nine"+"four"+"seven");
        return inttostring(n);
    }
    public static void main(String args[])
            {
                inttostring(1947);
                
            }
    
}

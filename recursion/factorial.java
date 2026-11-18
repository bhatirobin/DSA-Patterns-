import java.util.*;
public class factorial 
{
    public static int fact(int num)
    {
        if(num==0)
        {
            return 1;
        }
        int fact1 = fact(num-1);
        int fn = num * fact(num-1);
        return fn;
    }
       
       public static void main(String args[])
          {
             Scanner vr = new Scanner(System.in);
             int num= vr.nextInt(); 
             System.out.println(fact(num));     
          }
}

import java.util.*;
public class rdecrease
{

    public static void decreasen(int n)
            {
                if(n == 0)
                {
                    System.out.println(n);
                    return ;
                }
                System.out.println(n + " ");
                decreasen(n-1);
            }
    public static void main(String args[])
         {
            Scanner vr = new Scanner(System.in);

            int n = vr.nextInt();

            decreasen(n);

         }

}
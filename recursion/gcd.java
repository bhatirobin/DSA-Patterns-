import java.util.*;
public class gcd 
            {
                public static int divide(int x, int y)
                {
                    if(y == 0)
                    {
                        return x;
                    }
                  /*   if(x%y != 0 )
                    {
                        int rem = x%y;
                        x = y;
                        y = rem;
                    }*/
                    int z = divide(y, x%y);

                    return z;
                }
                public static void main(String args[])
                {
                    Scanner sc = new Scanner(System.in);

                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println(divide(x, y));
                }

             
}

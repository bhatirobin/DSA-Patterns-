import java.util.*;
public class uclidgcd 
{
    public static int gcd(int x, int y)
        {
            if(y==0)
            {
                return x;
            }
            int x2 = gcd(y,x% y);
            return x2;
        }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

System.out.println(gcd(x, y));

    }
    
}

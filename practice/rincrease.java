import java.util.*;
public class rincrease 
{
    public static void increasing(int n)
    {
        if(n == 50)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");

        increasing(n+1);
    }
    public static void main(String args[])
    {
        Scanner rv = new Scanner(System.in);

        int n = rv.nextInt();
       // int n2 = rv.nextInt();

        increasing(n);
    }
    
}

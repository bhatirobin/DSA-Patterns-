import java.util.*;
public class increasing {
    public static void increasing(int n)
    {
        if(n==50)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        increasing(n+1);
    }
     public static void main(String args[])
     {
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        increasing(n);
     }    
}

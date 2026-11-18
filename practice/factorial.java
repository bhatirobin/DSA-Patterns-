import java.util.*;
public class factorial 
{
    public static int factn(int n)
        {
            if(n == 0)
            {
                
                return 1;
            }
            
            return n*factn(n-1);
        } 
     public static void main(String args[])
        {
            Scanner sc =new Scanner(System.in);

            int n = sc.nextInt();

            System.out.println(factn(n));

        }
}

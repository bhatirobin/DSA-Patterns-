import java.util.*;
public class fibonacci 
{
    public static int fibo(int f)
    {
        if(f == 0 || f == 1)
        {
            return 1;
        }
        

        
           //int n1 = fibo(f-1);
         //  int n2 = fibo(f-2);
        
        return fibo(f-1) + fibo(f-2);
       // return n1+n2;
        
    }
     public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);

       // int n = sc.nextInt();

        System.out.println(fibo(10));

     }    
}

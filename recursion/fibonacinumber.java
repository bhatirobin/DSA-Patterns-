import java.util.*;
public class fibonacinumber {
    public static int fibonci(int fibonco)
    {
        
        if(fibonco == 0 || fibonco==1)
        {
            return fibonco; 
        }
         int n1 = fibonci(fibonco-1);
         int n2 = fibonci(fibonco-2);
         int n3 = n1 + n2;
         return n3; 
        //int fib = fibonci(fibonco-1);
        //int sumf = 
       // int n1 = 0;
        //int n2 = 1;
        //int n3 = n1+n2;

    }
    public static void main(String aargs[])
    {
    
        Scanner sc = new Scanner(System.in);
        int fibonco = sc.nextInt();
       
        System.out.println(fibonci(fibonco));
    }
    
}

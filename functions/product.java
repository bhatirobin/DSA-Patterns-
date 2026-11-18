import java.util.*;
public class product {
    public static int productr()
    {
        Scanner sc = new Scanner (System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();


        int result = a*b;
        System.out.println(result);

        return result;
    }
    public static void main(String args[]) {
        productr();
        
    }
    
}

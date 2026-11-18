import java.util.*;
public class callbyvalue {
 /*    public static void cal(int b,int c)
    {
       int sum = b+c;
       
    }*/
    
    public static void main(String args[]) {
        int a = 39;
        int b = 65;
        int temp =a;
        a = b;
        b = temp;
        System.out.println("a =" + a);
        System.out.println("b = " + b);
    }
    
}

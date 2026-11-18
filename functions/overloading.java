import java.util.*;
public class overloading {
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String args[]) {
        System.out.println(sum(45,22));
        System.out.println(sum(84,5,2));
        
    }
}

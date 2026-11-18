import java.util.*;
import  java.util.Arrays;

public class arr32 
{
       public static void swap(int a, int b)
          {
            System.out.println("before the swapping values");
            System.out.println("value of a="+ a);
            System.out.println("value of b="+ b);


            a = a+b;
            b = a-b;
            a = a-b;

            System.out.println("print after the swapping values:");
            System.out.println("value of a ="+ a);
            System.out.println("value of b ="+ b);
          }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int a = 9;
        int b = 3;
    
         swap(a, b);
        
    }
    
}

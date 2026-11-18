import java.util.*;
import java.util.Arrays;
public class arr31 
{

    public static void swap(int a, int b)
    {
        System.out.println("before the swapping for a & b");
        System.out.println("value of a="+a);
        System.out.println("value of b ="+ b);

        int temp = a;
           a = b; 
           b = temp;

           System.out.println("after swapping the values a & b");
           System.out.println("value of a="+a);
           System.out.println("value of b ="+b);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int a = 9;
        int b = 3;
          
        swap(a, b);
    }
    
}

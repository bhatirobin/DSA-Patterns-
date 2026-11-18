import java.util.*;
public class function11 
{
    public static int average(int a, int b, int c)
    {
        int average = a+b+c;

        System.out.println(average/3);

        return average;
    }
    

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of a");

        int a = sc.nextInt();

        System.out.println("enter the value of b");

        int b = sc.nextInt();

        System.out.println("enter the value of c");

        int c = sc.nextInt();
        
   average(a, b, c);

    }
    
}

import java.util.*;
public class function2 
{
    public static int sum(int a, int b, int sum)
    {
        sum = a+b;

        System.out.println(sum);

        return sum;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of a");

        int a = sc.nextInt();

        System.out.println("enter the value of b");

        int b = sc.nextInt();

        int sum = 0;

        sum(a, b, sum);


    }
    
}

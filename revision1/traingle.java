import java.util.*;
public class traingle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of a, b and c");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b > c && b+c > a && a+c> b)
        {
            System.out.println("traingle are valid ");
        }
        else
        {
            System.out.println("traingle are not valid");
        }

    }
    
}

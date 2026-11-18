//calculate the area of reactangle
import java.util.*;
public class function4 
{
    public static double area(int length , int brith, double rectangle)
    {
        rectangle = length * brith;

       System.out.println("rectangle is this "+ rectangle);

       return rectangle;

    }

    public static void main(String args[])
    {
          Scanner sc = new Scanner(System.in);

          System.out.println("enter the value of length");

          int length = sc.nextInt();

          System.out.println("enter the value of brith");

          int brith = sc.nextInt();

          double rectangle = 0;

          area(length, brith, rectangle);

    }
    
}

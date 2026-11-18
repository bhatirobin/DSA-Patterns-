import java.util.*;
public class leapyear 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the year value");

        int year = sc.nextInt();

        if( year % 4 == 0)
        {
            System.out.println("the year is leap");
        }
        else
        {
            System.out.println("the year is not not leap");
        }
        
    }
    
}

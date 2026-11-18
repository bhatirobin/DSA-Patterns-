import java.util.*;
public class square 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of length");

        int length = sc.nextInt();

        System.out.println("enter the value of brith");

        int brith = sc.nextInt();

        if(length == brith)
        {
            System.out.println("square are possible ");
        }
        else
        {
            System.out.println("square are not possible");
        }
        
    }
    
}

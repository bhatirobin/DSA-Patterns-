import java.util.*;
public class rectpattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b:");

        int b = sc.nextInt();

        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}

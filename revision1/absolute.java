import java.util.*;
public class absolute 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n ");

        int n = sc.nextInt();

        if(n<0)
        {
            n = n*(-1);
        }
        System.out.println("the positive absolute value is="+n);
        
    }
    
}

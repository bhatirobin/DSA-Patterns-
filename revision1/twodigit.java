import java.util.*;
public class twodigit 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n");

        int n = sc.nextInt();

        if(n>9 && n<100)
        {
            System.out.println("n are include for two digits");
        }
        else
        {
            System.out.println("n are not include for two digits");
        }
        
    }
    
}

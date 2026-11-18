import java.util.*;
public class greatestage 
{
    public static void main(String args[])
    {
        Scanner sc =  new Scanner (System.in);

        System.out.println("enter the age of ram");

        int r = sc.nextInt();

        System.out.println("enter the age of shyam");

        int s = sc.nextInt();

        System.out.println("enter the age of Ajay");

        int a = sc.nextInt();

        if(r>s && r>a)
        {
            System.out.println("ram is greatest age");
        }
        else if(s>r && s>a)
        {
            System.out.println("Shyam is greatest age");
        }
        else
        {
            System.out.println("Ajay is greatest age");
        }
    }
    
}

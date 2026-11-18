import java.util.*;
public class profitloss 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter your cost price ");

        int cp = sc.nextInt();

        System.out.println("enter the value of selling price:");

      //  int cp = sc.nextInt();
        int sp = sc.nextInt();

        if( sp > cp )

        {
            int p =sp - cp;

            System.out.println("to earn you profit ="+ p);
        }
        else
        {
          int  l = cp - sp;
            System.out.println("your business is lossfull="+l);
        }
        
    }
    
}

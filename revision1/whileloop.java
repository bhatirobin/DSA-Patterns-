import java.util.*;
public class whileloop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

      //  System.out.println("enter the value of n:");

      //  int n =  1;  //sc.nextInt();

        System.out.println("enter the value of limit");

        int l = sc.nextInt();

        int n =1;

        while(n<=l)
        {
            System.out.print(n+" ");
            
            n++;

           // break;
        }
    
    }
}

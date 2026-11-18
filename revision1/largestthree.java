import java.util.*;
public class largestthree 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of a , b and c");

        int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();


        if(a>b)
        {
            if(a>c)
            {
                System.out.println(" a is gratest number");
            }
            else
            {
                System.out.println("c is largest number");
            }
        }
        else 
        {
            if(b>a)
            {
                if(b>c)
                {
                    System.out.println("b is greatest number ");
                }
                else{
                    System.out.println("c is greatest number ");
                }
            }
        }
        
    }
    
}

import java.util.*;
public class whilebreak 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n");

        int n = sc.nextInt();

        while (n<=50)
        {
            if(n%5==0 && n%7==0)
            {
                System.out.println(n);
                break;
          
            }   n++;
            
        }
        
    }
    
}

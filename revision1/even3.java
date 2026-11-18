import java.util.*;
public class even3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n=  sc.nextInt();

        if(n % 2 == 0 || n % 3 == 0)
        {
            System.out.println("n is the even nuber");
        }
        else{
            System.out.println("n is the  odd number");
        }
        
    }
    
}

import java.util.*;
public class if1 
{
  
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n%2 == 0)
        {
            System.out.println("n is divisible of 2="+ " " +"n is prime number");
        }
        else{
            System.out.println("n is not divisible of 2="+" "+"n is not for the prime number");
        }
    }
}

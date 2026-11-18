import java.util.*;
public class primeloop {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    boolean isprime = true;
    if(n==2)
    {
        System.out.println("n is prime");
    }
    else
    {
        for(int i=2; i<=n-1; i++)
    {
        if(n%i==0)
        {
            isprime=false;
        //    System.out.println("NUMBER IS PRIME ");
        }
        
    }
    if(isprime == true)
    {
        System.out.println("NUMBER IS PRIME");
    }
    else{
        System.out.println("NUMB IS NOT PRIME");
    }
    }
}
 }
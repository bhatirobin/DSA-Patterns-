import java.util.*;
public class fact {

    public static int factorial(int n)
    {
        //here are you creating a base case
        if(n == 0) return 1;
       // {
        //    return 1;
       // }
       //he is a subproblem of a program 
       int fact = factorial(n-1);
       // int facts = n * factorial(n-1);
       //here are you creatint a selgwork for this problem
        int facts = n* fact;
        //return mei kya chaiye vo define kro jo fun ke andr icluded ho
        return facts;
    }
    public static void main(String args[])
    {
       
         System.out.println(factorial(10));


    }
    
}

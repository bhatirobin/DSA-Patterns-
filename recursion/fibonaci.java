public class fibonaci {
    public static int fib(int n)
{

    //here are the create the base case
    if(n == 0 || n == 1)
    {
        return n;
    }

    //here are to make the sub problem 
    int f1 = fib(n-1);
    int f2 =fib(n-2);


    //here are the create for the self work in this program
    //int fibo = f1 + f2;
    return f1 +f2;
}
    

    public static void main(String args[])
    {
         System.out.println(fib(6));

    }
}

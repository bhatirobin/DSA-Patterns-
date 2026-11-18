public class power1 {
    public static int power(int x, int y )
    {
        if(y==0) 
        {
            return 1;
        }

        int pow = power(x, y-1);

        return x*pow;

    }
    public static void main(String args[])
    {
        System.out.println(power(5,4));
    }
    
}

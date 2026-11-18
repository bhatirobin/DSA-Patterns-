public class sumdigit {

    
    public static int sum(int n)
    {
        if(n>=0 && n<=10)
        {
            return n;
        }
        int n1 = sum(n/10);
        int n2 = sum(n%10);
        int sum = n1+n2;
        return sum;
    }
    public static void main(String args[])
    {
       System.out.println(sum(1234));
    }
    
}

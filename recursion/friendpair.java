public class friendpair {
    public static int pairingboys(int n)
    {
        if(n == 1 || n == 2)
        {
            return n;
        }
        // choice 
        //single
        int f1 = pairingboys(n-1);

        //pair
        int f2 = pairingboys(n-2);
        int pairways = (n-1)*f2;

        // totalways
        int totalways = f1 + pairways;
        return totalways;
    }
    public static void main(String args[])
    {
        System.out.println(pairingboys(10));
    }

    
}

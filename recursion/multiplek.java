public class multiplek {

    public static void  multiply(int num, int k)
    {
        if(k == 0)
        {
            System.out.println(k);
            return ;
        
    // inmultiply(num, k-1);
         
            
        }
        multiply(num, k-1);


      System.out.println((num*k));
         //int  multi = num*k;
         
      //   return multi;
    }
    
    public static void main(String args[])
    {
        multiply(12, 5);
    }
}

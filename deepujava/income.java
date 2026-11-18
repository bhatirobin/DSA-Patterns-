import java.util.*;
public class income {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if(income>1000000)
{   
          tax =(int) (income * 0.3);
}
    else if( income>500000 && income<1000000)
    {
        tax = (int) (income * 0.2);
    }
    else{
        tax = 0;
    }
    System.out.println("your tax is:" + tax);
    }
    
}

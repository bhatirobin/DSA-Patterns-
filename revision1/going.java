import java.util.*;
public class going 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();

        if(money>100000)
        {
            System.out.println("you are going any where");
        }
        else if(money> 80000 && money<100000)
        {
            System.out.println("you are going to goa");
        }
        else if(money > 70000 && money < 80000)
        {
            System.out.println("you are going to  mumbai");
        } 
        else if(money>50000 && money < 70000)
        {
            System.out.println("you are going to haydrabad");
        }
        else if(money > 30000 && money< 50000)
        {
            System.out.println("you are going to banglore");
        }
        else
        {
            System.out.println("going to resturant with friends");
        }
        
    }
    
}

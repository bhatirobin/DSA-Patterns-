import java.util.*;
public class largestage 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the age of ram shyam and ajay");

        int ram = sc.nextInt();
        int shyam = sc.nextInt();
        int ajay = sc.nextInt();

        if(ram>shyam)
        {
            if(ram>ajay)
            {
                System.out.println("ram age is greatest");
            }
            else
            {
                System.out.println("ajay age is greatest");
            }
        }
        else
        {
            if(shyam > ram)
            {
                if(shyam > ajay)
                {
                    System.out.println("shyam age is greatest");
            
                }
                else
                {
                    System.out.println("ajay age is greatest");
                }
            }
        }
    }
    
}

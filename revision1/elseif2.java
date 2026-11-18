import java.util.*;
public class elseif2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        float marks = sc.nextInt();

        if(marks > 80)
        {
            System.out.println("you are the topper in the class");
        }
        else if(marks >65 && marks < 80 )
        {
            System.out.println("you are gain first division in a class");
        }
        else if(marks>50 && marks<60)
        {
            System.out.println("you are gain the second division in the class");
        }
        else if(marks > 35 && marks < 50)
        {
            System.out.println("you are gain the third division in the class");
        }
        else{
    
            System.out.println("you are fail in the class");
        }
        
    }
    
}

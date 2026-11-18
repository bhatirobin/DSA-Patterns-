import java.util.*;
public class count 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        
        int n = 12345;

        int count = 0;

     //  while(n>0)
    //    for(int i=(n)-1; i>0; i--)
    //     {
    //       if(i%10==0)
    //       {
    //           i = i/10;
    //           count++;
              
    //       }
    //       System.out.println(count);
    //       break;
               while(n>0)
               {
                n= n/10;
                count++;

               }            
             System.out.println(count);
           //  n--;
        }
        
    }

    


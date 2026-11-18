import java.util.*;
public class string 
{
    //jb hm data string ki form mei dete hai to args[] array nhi bnate
    //yha mei main function mei string[] ko array bnate hai 
      public static void main(String[] args)
      {
        Scanner r = new Scanner(System.in);
      // String s = r.next();//here are not efficient because it is print only for one word and after then space are free the data
        
        String x1 = r.nextLine();
        //it is a very effictive because it is not for the free data string after space
        //it is automactically attteched words
           
        System.out.println(x1);
        

        String r1 = r.nextLine();
        System.out.println(r1);
        char c = r1.charAt(0);
        System.out.println(c);

    
      }   
}

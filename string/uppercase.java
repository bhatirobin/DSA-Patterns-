import java.util.*;
public class uppercase {

    public static String uppercase1(String r)
    {
         StringBuilder sb = new StringBuilder("");
         char ch = Character.toUpperCase(r.length());
         sb.append(ch);


         for(int i=0; i<r.length(); i++)
         {
            if(ch.charAt(i) == ' ' i<r.length()-1)
            {
                 sb.append(r.charAt(i));
                 i++;
                 sb.append(Character.toUpperCase(r.charAt(i)));
            }
            else{
                sb.append(r.charAt(i));
            }
         }
         return sb.toString()
;
    }
    public static void main(String args[])
    {
        String r = "hello my name is kunal singh";
        uppercase1(r);
    }
    
}

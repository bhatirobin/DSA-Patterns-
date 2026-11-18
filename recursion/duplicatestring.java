import java.util.*;
public class duplicatestring {
    public static void duplicate(String s, int i, StringBuilder sb, boolean map)
{ 
    if(i == s.length())
    {
        System.out.println(sb);
        return ;
    }
    //work 
    char currchar = s.charAt(i);
    if(map [currchar-'a'] == true)
    {
        duplicate(s, i, sb, map);

    }
    else{
        map[currchar-'a'] = true;
        duplicate(s, i, sb.append(currchar), map);
    }

}    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //    int a = sc.nextInt();
      //  String arr[] = new String [a];
        String  s = "apnacollege";
duplicate(s, 0, null, false);



    }  
    
}

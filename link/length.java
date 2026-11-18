import java.util.*;
import java.util.LinkedList;
public class length 
{
    public static int length(Node Head)
       {
           int count = 0;
           while(Head != null) 
           {
            count++;
            Head = Head.next;
            
           }
           return count;
       }
    public static class Node
    {
        int data;
        String name;
        Node next;

        Node(int d, String n)
        {
            this.data = d;
            this.name = n;
        }
    }
    public static void main(String[] args) 
    {
        Node a = new Node(64, "jnkv");
        Node b = new Node(46, "igvb");
        Node c = new Node(67, "slakf");
        Node d = new Node(94, "iknv");
        Node e = new Node(75, "oiihg");


        a.next = b; 
        b.next = c;
        c.next = d;
        d.next = e;

        Node Head = a;

        System.out.println(length(Head));
    }
    
}

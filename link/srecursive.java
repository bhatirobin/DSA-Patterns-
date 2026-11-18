import java.util.*;
import java.util.LinkedList;;
public class srecursive 
{
    public static void recursive(Node Head)
    {
        //Node Head = j;
        if(Head == null)
        {
            return;
        }
        System.out.print(Head.data+" ");
        System.out.println(Head.name);

        recursive(Head.next);

    }
    public static class Node
    {
        int data;
        String name;
        Node next;

        Node(int nu, String na)
        {
            this.data = nu;
            this.name = na;
        }
    }
    public static void main(String[] args) 
    {
        Node j = new Node(62,"robin");
        Node k = new Node(65, "varsha");
        Node l = new Node(62, "kunal");
        Node m = new Node(70, "lucky");
        Node n = new Node(73, "aishu");
        Node o = new Node(72, "rudr pratap singh bhati");


          j.next = k;
          k.next = l;
          l.next = m;
          m.next = n ;
          n.next = o;

         Node Head = j;
    
         recursive(Head); 

    }
    
}

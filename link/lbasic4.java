import java.util.*;
import java.util.LinkedList;
public class lbasic4 
{
    public static class Node
    {
        int data;//it is take to value
        Node next;//it is make to take a address to another data
         
        Node(int data)
        {
            this.data = data;
        }
    }
    public static void main(String[] args) 
    {
        Node a = new Node(5);//here are you create the size
         
        Node b = new Node(10);
        Node c = new Node(20);
        Node d = new Node(30);
        Node e = new Node(50);
      // to link the data from to another data
      //a->b->c->d->e
       
      a.next = b;
      b.next = c;
      c.next = d;
      d.next = e;
         
System.out.println(a.next.data);
System.out.println(a.next);
System.out.println(b);
        
    }
    
}

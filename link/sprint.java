import java.util.*;
public class sprint 
{
    public static class Node
    {
        int data;
        Node next;

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
      // to link the data 
      a.next = b;
      b.next = c;
      c.next = d;
      d.next = e;

      System.out.println(a.data);
      System.out.println(a.next.data);
      System.out.println(a.next.next.data);
      System.out.println(a.next.next.next.data);
      System.out.println(a.next.next.next.next.next);

        
    }
    
}

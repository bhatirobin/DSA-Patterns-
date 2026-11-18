import java.util.*;
import java.util.LinkedList;
public class sprint5 
{
    public static void print(Node all)
    {
        while(all != null)
         {
            System.out.print(all.data+" ");

            all = all.next;
         }
    }
    public static class Node
    {
        int data;
        Node next;

        Node(int n)
        {
            this.data = n;
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

      Node all = a;

      //function calling
        
      print(all);
         
        
    }
    
}

import java.util.*;
import java.util.LinkedList;
public class sprint4 
{
    public static void print(Node j)
    {
        Node tem = j;

        while(tem != null)
        {
            System.out.print(tem.data+" ");

             tem = tem.next;
        }
        
    }
    public static class Node
    {
        int data;
        Node  next;

        Node(int val)
        {
         this.data = val;
        }
    }
 public static void main(String[] args) 
 {
     Node j = new Node(1000);
     Node k = new Node(2000);
     Node l = new Node(3000);
     Node m = new Node(4000);
     Node n = new Node(5000);

     //lin the first data to another next data

     j.next = k;
     k.next = l;
     l.next = m;
     m.next = n;

    
    print(j);
     
 }
    
}

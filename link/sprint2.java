import java.util.*;
import java.util.LinkedList;
public class sprint2 
{
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

        Node xx = j;

        for(int i=1; i<=5; i++)
        {
            System.out.println(xx.data);

             xx = xx.next;
        }

        
    }
    
}

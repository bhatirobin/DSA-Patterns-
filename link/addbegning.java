import java.util.*;
public class addbegning 
{
    public static class Node
      {
         
        int data;
        Node next;

        Node(int n)
        {
            this.data = n;
        }
      }
      public static class LinkedList
      {
          Node Head = null;
          Node tail = null;

            public static void insertstart(int val)
               {
                Node temp = new Node(val);
                if(Head == null)
                {
                  head = null;
                  tail = null;
                // Head = tail = temp;
                }
                else
                {
                       temp.next = Head;
                       Head = temp;
                }
            }
            void display()
              {
                Node temp = Head;
                while(temp != null)
                {
                  System.out.print(temp.data+" ");
                  temp = temp.next;
                }
              }
              int size()
              {
                Node temp = Head;
                int count = 0;
                while(temp != null)
                {
                  count++;
                  temp = temp.next;
                }
                return count;

              }
      }
    public static void main(String[] args) 
    {
        LinkedList n1 = new LinkedList();
        
            n1.insertstart(54);
    }
    
}

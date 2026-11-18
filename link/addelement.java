import java.util.*;
public class addelement 
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

            void insertend(int num)
            {
              Node temp = new Node(num);
                 //  this.next = temp;
                  //tail = temp;
              if(Head == null)
                {
                  Head = temp;
                  tail = temp;
                }
                else
                {
                  tail.next = temp;
                  tail = temp;
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
        
           n1.insertend(64);
           n1.insertend(97);
           n1.insertend(34);
           n1.insertend(46);

           n1.display();
           System.out.println();
            System.out.println(n1.size());
    }
    
}

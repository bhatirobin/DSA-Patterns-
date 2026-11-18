import java.util.*;


public class addlast2 
{
    public static class LinkedList
  {
       public static class Node
      {
         int data;
         Node next;

          public Node(int n)
          {
              this.data = n;
            this.next = null;
           }
       }
          public static Node head;
          public static Node tail;

          static void addstart(int n1)
           {
               Node temp = new Node(n1);

               if(head == null)
               { 
                  head = tail = temp;
                  return;
                }
                      temp.next = tail;
                tail = temp;
            }
              public static void addlast(int n)
              {
                 Node temp1 = new Node(n);

                  while(head == null)
                   {
                       head = tail = temp1;
                       return;
                   }
                  tail.next = temp1;
                  tail = temp1;
              }

        public static void display()
        {
           Node temp3 = head;
           
           while(temp3 != null)
           {
            System.out.print(temp3.data+" ");
            temp3 =  temp3.next;
           }
        }
   }
    public static void main(String[] args) 
    {
         LinkedList obj1 = new LinkedList();

       //  obj1.addstart(64);
         obj1.addlast(34);
         obj1.addstart(46);
         obj1.display();

         
         
    }
    
}

import java.util.*;

public class addlast 
{
    
    public static class LinkedList
      {
          public static class Node 
            {
                int data;
                Node next;

                public Node(int v1)
                  {
                      this.data = v1;
                      this.next = null;
                  }
            }
            public static Node head;
            public static Node tail;

            public static void addlast(int n)
            {
                 Node temp = new Node(n);

                 if(head == null)
                 {
                    head = temp;
                    tail = temp;
                 }
                 else
                 {
                       temp.next = head;

                       head = temp;
                  }
            }
            public static void display()
            {
                Node temp = head;

                while(temp != null)
                 {
                    System.out.print(temp.data+" ");
                    temp = temp.next;

                 }

            }
      }
    public static void main(String[] args) 
    {
        LinkedList obj1 = new LinkedList();

          obj1.addlast(54);
          obj1.addlast(76);
          obj1.addlast(67);
          obj1.display();
        
    }
    
}

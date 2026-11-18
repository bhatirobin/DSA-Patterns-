import java.util.*;



public class addfirst 
{
    public  static class LinkedList
    {
        public static class Node
           {

               int  data;
               Node next;

              public Node(int n)
               {
                  this.data = n;
                  this.next = null;
               }

           }
           public static Node head;
           public static Node tail;
    
        public static void addstart(int n)
        {
             //here are the first step to create the new node
             Node n1 = new Node(n);
            //here are create the base case

              if(head == null)
              {
                   head = n1;
                   tail = n1;

                   return;
              }

           //step2 are the old head point of data are know are point the new head data
            //newnode = head;

          n1.next = head;  //to link head tonext old head node

          //step3 are create the head value are new node
          //step3 = head = objectname - since new node
          // head = n1
          head = n1;

        }
       
    }
    public static void main(String[] args) 
    {
        LinkedList obj1 = new LinkedList();
        
        obj1.addstart(64);
        obj1.addstart(64);

      //  System.out.print(obj1.next.data);
     
       //  obj1.display();
    }
}

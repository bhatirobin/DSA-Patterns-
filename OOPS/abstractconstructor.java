public class abstractconstructor
{
    public static void main(String args[])
    {

    

hourse h =new hourse();
     h.eat();
     h.walk();
     System.out.println(h.color);

     rabit r = new rabit();
     r.eat();
     r.walk();
System.out.println(r.color());
      }
    }
     abstract class animal
     {
        String color;
        animal()
        {
            color ="brown";
        }
        void eat()
        {
            System.out.println("there are eating the food");
        }
        abstract void walk();
     } 
     class hourse extends animal
     {
        void changecolor()
        {
            color = "black";
        }
        void walk()
        {
            System.out.println("walks are the four leg");
        }
     }
     class rabit extends animal
     {
        rabit()
        {
            color = "white";

        }
        void walk()
        {
            System.out.println("walks are two legs");
        }
     }
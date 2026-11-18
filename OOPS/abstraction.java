public class abstraction
{
    public static void main(String args[])
      {
    /*     calculation r = new calculation();
        r.sum();
        r.walk();

        calculation2 v = new calculation2();
        v.sum();
        v.walk();
       
          calculation3 vr = new calculation3();
          vr.sum();
          vr.walk();
      }
}

abstract class calculator
{
    void sum()
    {
        System.out.println("hello varsha bhati");
    }
    abstract void  work();
}
class calculation extends calculator
{
    void work()
    {
        System.out.println("here is su of two variables");
    }
}
class calculation2 extends calculator
{
    void walk()
    {
        System.out.println("here is multiply of two variables");
    }
}
class calculation3 extends calculator
{
    void walk()
    {
        System.out.println("here is divided of two variables");
    }
}*/
     hourse h =new hourse();
     h.eat();
     h.walk();

     rabit r = new rabit();
     r.eat();
     r.walk();
      }
    }
     abstract class animal
     {
        void eat()
        {
            System.out.println("there are eating the food");
        }
        abstract void walk();
     } 
     class hourse extends animal
     {
        void walk()
        {
            System.out.println("walks are the four leg");
        }
     }
     class rabit extends animal
     {
        void walk()
        {
            System.out.println("walks are two legs");
        }
     }
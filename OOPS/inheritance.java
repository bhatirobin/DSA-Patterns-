public class inheritance {
    public static void main(String args[])
      {
           man harsh = new man();
           harsh.eat() ;
           harsh.swin() ;
      }
    
}
//parent class 
class animal
{
    String colour,name;
       
    void eat()
    {
        System.out.println("eats");
    }
    void breathe()
    {
        System.out.println("breathes");
    }
}
   //derived class
      
   class man extends animal
   {
    int weight;
    void swin()
    {
        System.out.println("swins in water");
    }
   }
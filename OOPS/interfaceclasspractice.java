public class interfaceclasspractice
{
      public static void main(String args[])
      {
           bear b = new bear();
           b.grass();
           b.nonvage();
      }
}
interface herbivore
{
    void grass();
}
interface carnivore
{
    void nonvage();
}
class bear implements herbivore,carnivore 
{
public void grass()
   {
    System.out.println("bears a eating a grass");
   } 
   public void nonvage()
   {
    System.out.println("bear are the eating the chicken");
   }

}
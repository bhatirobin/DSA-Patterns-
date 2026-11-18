public class methodoverriding {

    public static void main(String args[])
    {
           Bhati vr = new Bhati();
           //System.out.println(vr.eat());
          vr.eat();
    }
    
}
class Queen
{
    void eat()
    {
        System.out.println("hello mere bacche");
        
    }

 class Bhati extends Queen
 {
    void eat()
    {
        System.out.println("keise ho aap");
        
    }
 }
} 

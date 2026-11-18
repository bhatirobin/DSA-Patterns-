public class interfaceclass
{
     public static void main(String args[])
     {
        motti ji = new motti();
         ji.walking();

     }
}
interface robin
{
    void walking();
}
class motti implements robin
{
    public void walking()
    {
        System.out.println("east"+" "+ "west"+" "+"north"+" "+"south");
    }

}
class chor implements robin 
{
    public void walking()
    {
        System.out.println("left"+" "+"right"+" "+"back"+" "+"front");
    }

    
}
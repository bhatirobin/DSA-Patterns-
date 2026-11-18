public class methodoverloading {
       
    public static void main(String args[])
    {
       calculator vr = new calculator();
         vr.sum(16, 636,15);
         System.out.println(vr.sum(13, 13, 13));
         System.out.println(vr.sum( 5.5f, 2.5f));
         System.out.println(vr.sum("varsha", "bhati"));
          System.out.println(vr.sum(634,72));
        }
    
}
class calculator
{
    int sum(int a, int b)
    {
        return a+b;
    }
    String sum(String a, String b)
    {
        return a+b;
    }
    float sum(float a, float b)
    {
        return a+b;
    }
    int sum(int a, int b, int c)
    {
        return a+b+c;
    }
}

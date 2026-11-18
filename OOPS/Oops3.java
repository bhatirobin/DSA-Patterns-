public class Oops3 {
    public static void main()
    {
        pen p1 =new pen();
        p1.settip(3);
        System.out.println(p1.settip());
       // p1.setcolor("navyblue");
        //System.out.println(p1.setcolor());

    }
    
}
class pen{

     String color ;
     int tip;

     void getcolor(String newcolor)
     {
        color = newcolor;
     }
     int setcolor(String color)
     {
        return this.tip;
     }
     void settip(int newtip)
     {
        tip = newtip;
     }
     int settip()
     {
        return this.tip;
     }
}

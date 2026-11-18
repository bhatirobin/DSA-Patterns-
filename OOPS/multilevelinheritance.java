public class multilevelinheritance {
      
       public static void main(String args[])
       {
        table t1 = new table();
        t1.name="dainingtable";
        System.out.println(t1.name);
        t1.color="darkchocklate";
        System.out.println(t1.color);
        t1.design = "very effictive";
        System.out.println(t1.design);
        t1.feedback = "not compare this table";
        System.out.println(t1.feedback);
        t1.model = 1998;
        System.out.println(t1.model);
        t1.price = 100005894;
        System.out.println(t1.price);
        t1.rating = "five stars highest rating";
        System.out.println(t1.rating);       

       }
}
// base class / parent class
class car{
    String name,color,design,feedback;
    int model;
    
}
class chair extends car
{
    long price;
}
class table extends chair
{
    String rating;
}
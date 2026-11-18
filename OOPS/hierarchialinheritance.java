public class hierarchialinheritance {
       
    public static void main(String args[])
    {
        bike b = new bike();
        b.name = "splender";
        System.err.println(b.name);
        b.color= "black";
        System.out.println(b.color);
        b.price = 105000;
        System.out.println(b.price);
        b.rating = "five stars";
        System.out.println(b.rating);

        b.speed = 360;
        System.out.println(b.speed);
    }
    
}
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
class bike extends table
{
    int speed;
}

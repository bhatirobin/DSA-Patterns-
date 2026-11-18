public class constructor {
    public static void main(String args[])
    {
        student r1 =new student("varsha singh");
         student r2 = new student(384);
         System.out.println(r1.name);
         System.out.println(r2.roll);
    }
    
}
class student{
    String name;
    int roll;


     student(String name)
     {
        this.name = name;
     }
       
     student(int roll)
     {
        this.roll = roll;
     }

}

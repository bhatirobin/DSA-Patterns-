public class OOPS
{
    public static void main(String args[])
    {
       
student s1 = new student();
s1.name=("kunal singh");
System.out.println(s1.name);
s1.fname = ("mr Ompal singh");
System.out.println(s1.fname);
s1.mname = ("miss nagina devi");
System.out.println(s1.mname);
s1.phoneno = 96754926;
System.out.println(s1.phoneno);
s1.fees = 50000;
System.out.println(s1.fees);
System.out.println();


college BITS = new college();
BITS.name = ("bhagwati institute technology & science");
BITS.developed = 2009;
   
System.out.println(BITS.name);
System.out.println(BITS.developed);
    }
}
    
class student
{
//public
    String name;
    String fname;
    String mname;
     long phoneno;
    int fees;
    String address;

}
    class college{
        String name;
        int developed;

    
        
    }
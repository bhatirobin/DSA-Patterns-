public class shallow {
    public static void main(String args[]) 
       {
        bhati s1 = new bhati();
        s1.name = "kunalsingh";
        s1.roll = 5468;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 87;

        bhati s2 = new bhati(s1);
        s2.roll = 999;
        s2.marks[1] = 127;
        for(int i=0; i<3; i++)
        {
            System.out.println(s2.marks[i]);
        }


       }
}
class bhati{
    String name;
    int roll;
    String password;
    int marks[];
//here is a shallow constructor
//bhati(bhati s1)
/*{
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    this.marks = s1.marks;
}*/
//here are you create a deep constructor
bhati(bhati s1)
{
    marks  = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    for(int i=0; i<marks.length; i++)
   {
    this.marks[i]= s1.marks[i];
   }
}
    bhati()
    {
        marks = new int[3];
        System.out.println("constructor is called");

    }
    bhati(String name)
    {
         this.name=name;
    }
    bhati(int roll)
    {
        this.roll = roll;
    }
}

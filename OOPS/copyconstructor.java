public class copyconstructor {
    public static void main(String args[])
    {
          //create an obect
          student s1 = new student();
          s1.name ="bhati";
          s1.password = 542555;
          s1.roll = 5854;
        //  s1.percent = 79.5;
        student s2 = new student(name);
        
    }
    
}
   
class student{
    String name;
    int roll;
    float percent;
    int password;

    student(student name)
    {
        this.name = name;
          this.percent = percent;
    }
//student(int roll)
  //  {
    //    this.roll = roll;

   // }
   // student(float percent)
  //  {
    //    this.percent = percent;
   // }
    /*student(int password)
    {
        this.password = password;
    }*/
}

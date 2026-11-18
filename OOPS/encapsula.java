public class encapsula {

    public static void main(String args[])
    {
     bankaccount a1 = new bankaccount();

       a1.accountnumber = 0341103;

       System.out.println(a1.accountnumber);
        
            a1.ifccode = 8203001;
            System.out.println(a1.number);
              
               a1.email = "saurabhsingh421@gmail.com";
               System.out.println(a1.email);
                  
                 a1.ammount = 9000000;
                  System.out.println(a1.ammount);
                    
                     a1.id = "saurabh bhati";
                      System.out.println(a1.id);
                       
                        a1.pan = "ao002375231fc";
                           System.out.println(a1.pan);
                              
                           a1.fname = "ajeet singh bhati";
                             System.out.println(a1.fname);
                              
                              a1.mname ="Hammlta devi";
                              System.out.println(a1.mname);
                             /*
                             inko hm isliye directly acces nhi kr skte 
                             kyuki password ek  private acces modifier hai or 
                             vo sirf functo ke through hi hm use acces kr skte hai
                              */   
                          //    a1.password =  7337201;
                            //    System.out.println(a1.password);
                              
                            
                            /*
                              isko hm yha pr sirf password create kr skte hai 
                              by through of setpassword function ke through 
                              otherwise directly hm pass main function ke andr 
                              initilize nhi kr skte hai  */ 
                            a1.setpassword(84362311);
                               /*
                                * or iske andr bhi hm log sirf password change 
                                ya fir genrate kr skte hai access nhi kr skte kyuki 
                                vo ek private access modifier hai;
                                */
    }
    
}
class bankaccount
{
    private long password;
      public
    long accountnumber;
     long ifccode;
     long number;
     String email;
     long ammount;
     String id;
     String pan;
     String fname;
     String mname;
       // jab kisi class mein private data ko acces krna
       //ho tab hm class ke andr hi function bnakr usse check ya acces 
       //kr skte hai and after then usko main function ke andr jakr use call kr dete hain
     public void setpassword(long pass)
     {
         password = pass;
     }

}


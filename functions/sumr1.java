import java.util.*;
public class sumr1 {
    public static int csum(int a,int b)
    //(int a,int b) jb function declare kiya jata hai or uske andr value li jati hai 
    //unhe perameters kehte hai 
    //or jb calling time ye func. ke andr perameters variable define kiye jate hai unko arguments kehte hai
    {
        int sum = a+b;
        System.out.println("sum is :" +sum);
        return sum;
    }
    
    /*
     * jb function with arguments mei hm kuch bhi argements 
     * de rhe hain to hmko main function ke arguments 
     * ke andr hmko string ke aage [] array nhi lgana chahiye
     * vo [] args ke aage [] array lgaya jata hai.
     */
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        /*
         * jb koi bhi function with arguments ke through pass 
         * kiya jata hai to call
         * krte time function caliing jb hoti hai 
         * to usme agruments ke variable bhi 
         * define krne hote hain otherwise error show krta hai
         * callig funtion
         */
        /*
         * or agr function retun type hai to hm usko calling time 
         * main function ke andr bhi likh skte 
         * hai or vo kuch aise hai.
         */
        //int sum =csum(a,b);
      //  System.out.println("sum is :" +sum); 
      //aise bhi kr skte hai.
        csum(a,b);//is known as function arguments (a,b)
    }
    
}

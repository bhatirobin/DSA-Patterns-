import java.util.ArrayList;
public class add2ds 
{
    public static void main(String args[])
        {
            ArrayList<Integer> st = new ArrayList<>();

            st.add(12);
            st.add(15);
            st.add(42);
            st.add(76);
            st.add(123);

         //   st.add(2, 654);

            System.out.println(st);

            st.add(3, 989);

            System.out.println(st);
            
            
        }
    
}

import java.util.*;
public class containvalue 
{
    public static void main(String args[])
    {
        ArrayList<Integer> st = new ArrayList<>();

        st.add(12);
        st.add(15);
        st.add(42);
        st.add(76);
        st.add(82);

        System.out.println(st);

        System.out.println(st.contains(15));
        System.out.println(st.contains(789));
    }
    
}

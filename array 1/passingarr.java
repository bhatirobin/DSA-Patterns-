import java.util.*;
public class passingarr {

    public static void update(int marks[])
    {
        for(int i=0;i<marks.length; i++)
        {
            marks[i]=marks[i]+1;
        }

    }
    public static void main(String args[]) {
        int marks[] = { 12,46,13,33,21,31};
        update(marks);
        for(int i=0; i<marks.length; i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
    
}

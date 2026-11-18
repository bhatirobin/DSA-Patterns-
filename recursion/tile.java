public class tile
{
    public static int rooftile(int n)
    {
        //here are the declaring the condition 
        if(n == 0 || n == 1)
        {
            return 1;
        }
        //here are declaring the vertical problem
        int vertical = rooftile(n-1);

        //here are declaring the horizontal problem
        int horizontal = rooftile(n-2);

        //here are the calculate the tile

        int tileways = vertical + horizontal;
        return tileways;
    }
    public static void main(String args[])
    {
        System.out.println(rooftile(3));
    }
}
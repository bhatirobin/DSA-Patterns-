import java.util.*;
public class arr41 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter input the array elements row & column");

        int arr[][] = new int[3][4];

        for(int i=0; i<3; i++)
          {
              for(int j=0; j<4; j++)
                {
                    arr[i][j] = sc.nextInt();
                }
          }
    }
    
}

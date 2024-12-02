//Searching an element x in 2-D matrix
import java.util.*;
public class twod_array 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int numbers[][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number to be found:");
        int x=sc.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(numbers[i][j]==x)
                {
                    System.out.println("The value is available at index:("+i+","+j+")");
                }
            }
            System.out.println();
        }
    }
}

//Inverted Half Pyramid(Rotated by 180degree) Pattern
public class Pattern5 
{
    public static void main(String[] args)
    {
       for(int i=1;i<=4;i++)
       {
        for(int j=1;j<=4-i;j++)
        {
            System.out.print(" "); //To print space
        } 
        for(int j=1;j<=i;j++)
        {
            System.out.print("*"); // To print *
        }
            System.out.println();   
       }
    }
}

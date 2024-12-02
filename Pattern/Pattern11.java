//Butterfly Pattern
public class Pattern11 {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=4;i++)
        {   
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*n;j++)
            {
                System.out.print(" ");
            }
            n--;
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
                System.out.println();
        }  
        n=0; 
        for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*n;j++)
            {
                System.out.print(" ");
            }
            n++;
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
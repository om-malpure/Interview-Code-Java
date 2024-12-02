//Pascal's Triangle
public class Pattern {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++) 
        {
            for(int k=4;k>=i;k--) 
            {
                System.out.print(" ");
            }
            int num=1;
            for(int j=1;j<=i;j++) 
            {
                System.out.print(num + " ");
                num = num * (i - j) / j; //Formula to print Pascal's Triangle
            }
            System.out.println();
        }
    }
}

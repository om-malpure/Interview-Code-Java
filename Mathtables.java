import java.util.*;
public class Mathtables
{
    public static void table(int n,int tablelimit)
    {
        for(int i=1;i<=tablelimit;i++)
        {   
            int result=n*i;
            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tablelimit=sc.nextInt();
        table(n,tablelimit);
    }
}
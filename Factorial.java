import java.util.*;
public class Factorial
{
    public static void factorial(int num)
    {
        if(num<0)
        {
            System.out.println("Invalid Number");
            return;
        }
        int factorial=1;
       for(int i=num;i>=1;i--)
       {
            factorial*=i;
       }
        System.out.println("Factorial of "+num+" is "+factorial);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        factorial(num);
    }
}

//Print if a number is prime or not (Input n from the user). 

import java.util.*;
class Prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int flag=0;
        if(n<2)
        {
            System.out.println("It is not a prime number");
            return;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
    }
}

//Write a function that calculates the Greatest Common Divisor of 2 numbers. 

import java.util.*;
public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
        }
            System.out.println("GCD of 2 numbers is "+b);
    }
}
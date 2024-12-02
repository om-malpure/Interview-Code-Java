/*Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.*/

import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f;
        int f0=0;
        int f1=1;
        System.out.print(f0+"  "+f1+"  ");
        for(int i=1;i<=n;i++)
        {
            f=f0+f1;
            f0=f1;
            f1=f;
            System.out.print(f+"  ");
        }
    }
}

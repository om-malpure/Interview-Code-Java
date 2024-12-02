/*Write a function that takes a number n as input and prints this pattern for 2*n-1 lines.
E.g. Input:3
Output:  *
         * *
         * * *
         * *
         *                                            */

import java.util.*;
public class exampattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }   
}

//Two numbers are entered by the user x and n. Write a function to find the value of one number raised to the
// power of another i.e. xn.


import java.util.*;
class exponent
{
    public static void power(double x,int n)
    {

         double result=Math.pow(x,n);
         System.out.println(x+" to the power "+n+" is "+result);
    }
    public static void main(String[] args) 
    {  
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the base:");
    double x=sc.nextDouble();
    System.out.println("Enter the power:");
    int n=sc.nextInt();

        power(x,n);    
    }
}
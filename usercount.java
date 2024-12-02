/*Write a program to enter the numbers till the user wants and at the end it should 
  display the count of positive, negative and zeros entered.*/ 

import java.util.*;
public class usercount {
    public static void main(String[] args)
    {  
        Scanner sc=new Scanner(System.in);
        int input;
        int pos=0;int neg=0;int zero=0;
        do
        {
            System.out.println("Enter the number:");
            int num=sc.nextInt();
            if(num>0)
            {
                pos++;
            }
            else if(num<0)
            {
                neg++;
            }
            else
            {
                zero++;
            }
            System.out.println("Press 1 to continue and 0 to stop");
            input=sc.nextInt();
        }while(input==1);
            System.out.println("Zero's:"+zero+" Positive number:"+pos+" Negative number:"+neg);
    }
}

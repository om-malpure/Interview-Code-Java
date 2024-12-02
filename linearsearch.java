import java.util.*;
public class linearsearch
{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array:");
       int size=sc.nextInt();
       int arr[]=new int[size];
       for(int i=0;i<size;i++)
       {
            arr[i]=sc.nextInt();
       }
       System.out.println("Enter the number to be found:");
       int x=sc.nextInt();
       int flag=0;
       for(int i=0;i<arr.length;i++) // or i<size
       {
            if(arr[i]==x)
            {
                System.out.println("x is found at "+i);
                flag=1;
                break;
            }
       }
       if(flag==0)
       {
            System.out.println("Number is not present in array.");
       }
    }
}
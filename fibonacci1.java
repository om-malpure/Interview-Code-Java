import java.util.*;
public class fibonacci1 {
    
    public static void fibononrec(int size)
    {
        int f0=0,f1=1,f;
            System.out.print(f0+" "+f1+" ");
        for(int i=3;i<=size;i++)
        {
            f=f0+f1;
            f0=f1;
            f1=f;
            System.out.print(f+" ");
        }
    }
    public static int fiborec(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
            return fiborec(n-1)+fiborec(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println("Enter the choice:1.Recursive 2.Non-Recursive");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1: for(int i=0;i<size;i++)
                    {
                        System.out.print(fiborec(i)+" ");
                    }
                    break;
            case 2: fibononrec(size);
                    break;
            default: System.out.println("Invalid Choice");
        }
    }
}

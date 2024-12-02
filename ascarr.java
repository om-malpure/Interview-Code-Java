import java.util.*;
public class ascarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int num[]=new int[size];
        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt();
        }
        int flag=0;
        for(int i=0;i<size-1;i++)
        {
            if(num[i]>num[i+1])
            {
                flag=1;
            }
        }
        if(flag==1)
        {
            System.out.println("Numbers are not arranged in ascending order.");
        }
        else
        {
            System.out.println("Numbers are arranged in descending order.");
        }
    }
}

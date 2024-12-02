import java.util.*;
public class maxminarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int num[]=new int[size];

        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<size;i++)
        {
            if(num[i]<min)
            {
                min=num[i];
            }
            if(num[i]>max)
            {
                max=num[i];
            }
        }
            System.out.println("Minimum no. is "+min);
            System.out.println("Maximum no. is "+max);
    }
}

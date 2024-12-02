import java.util.*;
public class EvenOdd {

    public static void check(int num)
    {
        if(num%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        check(num);
    }
}

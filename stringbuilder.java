import java.util.*;
public class stringbuilder
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'S');
        System.out.println(sb);
        sb.insert(2,'i');
        System.out.println(sb);
    }
}
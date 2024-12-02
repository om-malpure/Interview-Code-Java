//Insertion Sort:dividing the data into a sorted part and an unsorted part
import java.util.*;
class insertionsort
{
    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<arr.length;i++)
        {
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }

            printarr(arr);
    }
} 
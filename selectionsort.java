/*Selection Sort : 0th index element is compared with all the other elements and the smallest element is placed at starting position and
    the same happens for 1st index and so on index elements going from smallest,2nd smallest element and so on.*/

import java.util.*;
public class selectionsort {

            public static void printarr(int num[])
            {
                for(int i=0;i<num.length;i++)
                {
                    System.out.print(num[i]+" ");
                }
            }
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int size=sc.nextInt();
                int num[]=new int[size];
                for(int i=0;i<num.length;i++)
                {
                   num[i]=sc.nextInt();
                }
                for(int i=0;i<num.length-1;i++)
                {
                    int smallest=i;
                    for(int j=i+1;j<num.length;j++)
                    {
                        if(num[smallest]>num[j])
                        {
                            smallest=j;
                        }
                    }
                        int temp=num[smallest];
                        num[smallest]=num[i];
                        num[i]=temp;
                }
                        printarr(num);
               }
            }
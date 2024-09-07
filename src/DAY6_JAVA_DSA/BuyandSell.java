package DAY6_JAVA_DSA;

import java.util.Scanner;

public class BuyandSell {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the n size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        // int j=0,k=n-1;
        // int profit=0;
        // int min=Integer.MAX_VALUE;
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++)
        // {
        //     if(j<k)
        //     {
        //         if(min>arr[j])
        //         {
        //             min=arr[j];   
        //         }

        //         if(max<arr[k])
        //         {
        //             max=arr[k];
        //         }
        //         if(max-min>profit)
        //         {
        //             profit=max-min;
        //         }
        //     }
        //     j++;
        //     k--;
        // }
        //System.out.println(profit);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int profit=0;
        for(int i=0;i<n;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
            max=arr[i]-min;
            if(max>profit)
            profit=max;


        }
        System.out.println(profit);
    }
}

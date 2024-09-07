package DAY6_JAVA_DSA;

import java.util.Scanner;

public class SlidingWindow {
   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the n size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the k size");
        int k=sc.nextInt();

        slid(arr,n,k);

        
    }
    public static void slid(int arr[],int n,int k)
    {
        int max=0;
        
        for(int i=0;i<k;i++)
        {
            max+=arr[i];
        }
        int window=max;
        for(int i=k;i<n;i++)
        {
            window+=arr[i]-arr[i-k];
            max=Math.max(max, window);
        }
        System.out.println(max);
    }
}

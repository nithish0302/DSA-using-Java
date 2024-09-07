package DAY6_JAVA_DSA;

import java.util.Scanner;

public class runningSumOfArray {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the n size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            arr[i]=sum;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
package DAY5_JAVA_DSA;

import java.util.Scanner;

public class FindTheContiguousSubarray {
   static Scanner sc=new Scanner(System.in);
   public static void main(String[] args) {
    System.out.println("Enter the n size");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int max=arr[0];
    int currentmax=arr[0];
    for(int i=0;i<n;i++)
    {
        currentmax=Math.max(arr[i],currentmax+arr[i]);
        max=Math.max(max, currentmax);
    }
    System.out.println(max);
   } 
}

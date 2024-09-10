package DAY8_JAVA_DSA;

import java.util.Scanner;

public class SwapTheIndex {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array element");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the left Index");
        int left=sc.nextInt();
        System.out.println("Enter the right index");
        int right=sc.nextInt();
        ReverseSubarray(arr, left, right);

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
    public static void ReverseSubarray(int[] arr,int left,int right)
    {
        if(left>=right)
        {
            return;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        ReverseSubarray(arr,left+1,right-1);
    }
}

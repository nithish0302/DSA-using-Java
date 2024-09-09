package DAY7_JAVA_DSA;

import java.util.Scanner;

public class ContiguousSubarrayOfProduct {
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
        System.out.println("Enter the product value");
        int k=sc.nextInt();
        method2(arr, k, n);
    }
    public static void method1(int arr[],int k,int n)
    {
        int  count=0;
        int pro=1;
        for(int i=0;i<n;i++)
        {   if(arr[i]<k)
            {
                count++;
            }
            else
            {
                continue;
            }
            pro*=arr[i];
            for(int j=i+1;j<n;j++)
            {   
                pro*=arr[j];

                if(pro<k)
                {
                    count++;
                }
            }
            pro=1;
        }
        System.out.println(count);
    }

    public static void method2(int arr[],int k,int n)
    {
        int count=0;
        int right=0;
        int left=0;
        int pro=1;
        for(int i=right;i<n;i++)
        {
            pro*=arr[i];
            while(pro>=k)
            {
                pro/=arr[left];
                left++;
            }
            count+=(i-left)+1;
        }
        System.out.println(count);
    }
}

package DAY11_JAVA_DSA;

import java.util.Scanner;
public class LinearSearch {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the n size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array element");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target ");
        int target=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                System.out.println("Element found at index:"+i);
                break;
            }
        }
    }
}

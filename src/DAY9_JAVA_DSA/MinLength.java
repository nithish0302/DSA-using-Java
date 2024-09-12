package DAY9_JAVA_DSA;

import java.util.Scanner;

public class MinLength {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the n size");
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target");
        int target=sc.nextInt();
        int i=0;
        int minilength=Integer.MAX_VALUE;
        int currentSum=0;
        for(int k=0;k<n;k++)
        {
            currentSum+=arr[k];
            while(currentSum>=target)
            {
                minilength=Math.min(minilength, k-i+1);
                currentSum-=arr[i];
                i++;
            }
        }
        System.out.println(minilength);
    }
}

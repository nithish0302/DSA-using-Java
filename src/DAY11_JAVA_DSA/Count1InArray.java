package DAY11_JAVA_DSA;
import java.util.*;
public class Count1InArray {
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
    }
    static int binary(int arr[],int low,int high)
    {
        int val=0;
        if(low<high)
        {
            int mid=(low+high)/2;
            if(mid==1)
            {
                
            }
        }
        return 0;
    }
}

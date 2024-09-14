package DAY11_JAVA_DSA;
import java.util.*;
public class BinarySearch {
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
        int va=binary(arr, 0, n, target);
        System.out.println(va);
    }
    static int binary(int arr[],int low,int high,int x)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid]>x)
            return binary(arr, low, mid-1, x);
            
            else
            return binary(arr, mid+1, high, x);
        }
        else
        return -1;
    }
}

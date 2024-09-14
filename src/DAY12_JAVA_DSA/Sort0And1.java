package DAY12_JAVA_DSA;
import java.util.*;
public class Sort0And1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the n size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left=0;int right=n-1;
        while(left<right)
        {
            if(arr[left]==1 && arr[right]==0)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }

            if(arr[left]==0)
            left++;
            if(arr[right]==1)
            {
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

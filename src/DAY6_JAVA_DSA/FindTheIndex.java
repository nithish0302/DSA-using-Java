package DAY6_JAVA_DSA;

import java.util.Scanner;

public class FindTheIndex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the n size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = prefixCal(arr, n);
        
      int leftsum=0;
      int rightsum=0;
      for(int i=0;i<n;i++)
      {
        rightsum=sum-leftsum-arr[i];
        if(rightsum==leftsum)
        {
            System.out.println(i);
            break;
        }
      
            
            leftsum+=arr[i];
        
      }

    }

    static int prefixCal(int arr[], int n) {
        
        int sum = 0;
        for (int j = 0; j < n; j++) {
            // if (j != i) {
                sum += arr[j];
             //   arr1[i] = sum;
            // } else {
            //     arr1[i] = arr[i];
            // }
        }

        return sum;
    }

}

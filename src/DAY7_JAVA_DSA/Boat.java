package DAY7_JAVA_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Boat {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of n");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the limit size");
        int limit = sc.nextInt();
        int left = 0;
        int right = n - 1;
        int count = 0;
        Arrays.sort(arr);
       while(left<=right)
       {
            if (arr[left] + arr[right] <= limit) {
                left++;
                } 
                count++;
                right--;
            
        }
        System.out.println(count);
    }
}

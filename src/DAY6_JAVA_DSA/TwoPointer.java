package DAY6_JAVA_DSA;

import java.util.Scanner;

public class TwoPointer {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the n size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = n - 1;
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            int tot = arr[left] + arr[right];
            if (tot == target) {
                System.out.println(left + " " + right);
                flag = true;
                break;
            } else if (tot > target) {
                right--;
            } else {
                left++;
            }
        }
        if (flag == false) {
            System.out.println("Enter cant found");
        }
    }
}

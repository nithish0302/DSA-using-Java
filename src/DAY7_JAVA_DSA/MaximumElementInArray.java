package DAY7_JAVA_DSA;

import java.util.Scanner;

public class MaximumElementInArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the n size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        max(arr, 0, n - 1);

    }

    public static int max(int arr[], int low, int high) {
        int le = 0;
        int ri = 0;
        // int maz = 0;
        if (low == high) {
            return arr[low];
        }

        int mid = (low + high) / 2;
        le = max(arr, low, mid);
        ri = max(arr, mid + 1, high);
        return Math.max(le, ri);

        // return maz;
    }
}

package DAY3_JAVA_DSA;

import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr[0] = arr[0] + arr[n - 1];
        arr[n - 1] = arr[0] - arr[n - 1];
        arr[0] = arr[0] - arr[n - 1];
        System.out.println("After Swap");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}

package DAY5_JAVA_DSA;

import java.util.Scanner;

public class SumOfSubarray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the array size");
        int n = sc.nextInt();
        // System.out.println("Enter the col size");
        // int col=sc.nextInt();
        int arr[] = scan(n);
        subarr(arr, n);
    }

    public static int[] scan(int n) {
        int arr[] = new int[n];
        System.out.println("Enter the array element");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        return arr;
    }

    public static void subarr(int arr[], int n) {
        int sum = 0;
        for (int i = 2; i <= 5; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

}

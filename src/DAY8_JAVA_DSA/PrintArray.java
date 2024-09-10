package DAY8_JAVA_DSA;

import java.util.*;

public class PrintArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the n size");
        int n = sc.nextInt();
        System.out.println("Enter the array element");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = n - 1;
        System.out.println("The output is");
        print(arr, i);

    }

    static void print(int arr[], int in) {
        if (in == -1)
            return;

        System.out.println(arr[in]);
        print(arr, --in);
    }
}

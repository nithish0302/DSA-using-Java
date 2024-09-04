package DAY3_JAVA_DSA;

import java.util.*;

public class ArrayOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0, product = 1;
        float avg = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println("sum:" + sum);
        System.out.println("Product:" + product);
        System.err.println("Average:" + (float)sum / n);
        sc.close();
    }
}

package DAY3_JAVA_DSA;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr n value");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array Element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println(min);
        sc.close();
    }
}

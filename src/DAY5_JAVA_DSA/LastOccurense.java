package DAY5_JAVA_DSA;

import java.util.Scanner;

public class LastOccurense {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the n size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array element ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find");
        int x = sc.nextInt();
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == x) {
                System.out.println("The element present in the index " + i);
                break;
            }
        }
        sc.close();
    }
}

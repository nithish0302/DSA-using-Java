package DAY11_JAVA_DSA;

import java.util.Scanner;

public class SingleNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the n size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int num = 0;
        for (int i = 0; i < n; i++) {
            num ^= arr[i];
        }
        System.out.println("the output is");
        System.out.println(num);
    }
}

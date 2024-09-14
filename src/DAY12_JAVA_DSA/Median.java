package DAY12_JAVA_DSA;

import java.util.*;

public class Median {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the n size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
     
        float sum = 0;
        if (n % 2 == 0) {
          //  System.out.println(arr[n / 2] + arr[n / 2 - 1]);
            sum = (arr[n / 2] + arr[n / 2 - 1]) / 2.0f;
        } else {
            sum = arr[n / 2];
        }
        System.out.println("Median is:");
        System.out.println(sum);

       // System.out.println(13/2.0);
    }
}

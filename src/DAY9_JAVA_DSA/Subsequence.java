package DAY9_JAVA_DSA;

import java.util.*;

public class Subsequence {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        System.out.println("Enter the array element");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        // List<Integer>li=new ArrayList<Integer>();
        int max = 0;

        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        System.out.println(count + 1);
    }

}

package DAY3_JAVA_DSA;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int semax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= max) {
                semax = max;
                max = arr[i];
            } 
            else if (arr[i] > semax && arr[i]<max) {
                semax = arr[i];
            }
        }
        System.out.println(semax);
        sc.close();
    }
}

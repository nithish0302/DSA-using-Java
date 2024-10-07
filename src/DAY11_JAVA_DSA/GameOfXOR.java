package DAY11_JAVA_DSA;

import java.util.Scanner;

public class GameOfXOR {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array element");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // method 1
        int totalxor = 0;
        // List<Integer>li=new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            totalxor ^= arr[i];
            int sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                sum ^= arr[j];
                totalxor ^= sum;
            }

        }
        System.out.println("The answer is");
        System.out.println(totalxor);
        sc.close();

    }
}

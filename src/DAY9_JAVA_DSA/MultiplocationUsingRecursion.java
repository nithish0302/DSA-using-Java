package DAY9_JAVA_DSA;

import java.util.Scanner;

public class MultiplocationUsingRecursion {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the a value");
        int a = sc.nextInt();
        System.out.println("Enter the b value");
        int b = sc.nextInt();
        int sum = multiple(a, b);

        System.out.println(sum);
    }

    static int multiple(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        if (a > 0) {
            return a + multiple(a, b - 1);
        }
        return -multiple(a, -b);
    }
}

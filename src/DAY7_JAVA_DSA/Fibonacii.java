package DAY7_JAVA_DSA;

import java.util.Scanner;

public class Fibonacii {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the n value");
        int n = sc.nextInt();
        System.out.println(fact(n));

    }

    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
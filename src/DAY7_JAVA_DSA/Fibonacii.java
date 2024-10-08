package DAY7_JAVA_DSA;

import java.util.Scanner;

public class Fibonacii {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }

    public static int fibo(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fibo(n - 1) + fibo(n - 2);
    }
}

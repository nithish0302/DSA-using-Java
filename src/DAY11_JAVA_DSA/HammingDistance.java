package DAY11_JAVA_DSA;

import java.util.Scanner;

public class HammingDistance {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the a");
        int a = sc.nextInt();
        System.out.println("Enter the b");
        int b = sc.nextInt();

        int result = hamming(a, b);
        System.out.println(result);
    }

    static int hamming(int a, int b) {
        int xor = a ^ b;
        int count = 0;
        while (xor > 0) {
            count += xor & 1;
            xor >>= 1;
        }
        return count;
    }

}

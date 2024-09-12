package DAY10_JAVA_DSA;

import java.util.*;

public class NofXOR {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        if (n % 4 == 0) {
            System.out.println(1);
        } else if (n % 4 == 0)
            System.out.println(n);
        else if (n % 4 == 2)
            System.out.println(n + 1);
        else
            System.out.println(0);
    }
}

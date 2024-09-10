package DAY8_JAVA_DSA;

import java.util.Scanner;

public class PrintString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        int i = 0;
        print(s1, i);
    }

    static void print(String s1, int i) {
        if (i < s1.length()) {
            System.out.println(s1.charAt(i));
            print(s1, ++i);
        }
    }
}

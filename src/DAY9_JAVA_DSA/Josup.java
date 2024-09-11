package DAY9_JAVA_DSA;

import java.util.*;

public class Josup {
    public static int killperson(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (killperson(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of people:");
        int size = sc.nextInt();
        System.out.println("No to kill:");
        int kill = sc.nextInt();
        int safe = killperson(size, kill);
        System.out.println("safe person:" +( safe+1));
        sc.close();
    }
    

}

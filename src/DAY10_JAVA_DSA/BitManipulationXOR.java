
package DAY10_JAVA_DSA;

/**
 * BitManipulationXOR
 */
import java.util.*;

public class BitManipulationXOR {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the n size");
        int n = sc.nextInt();
        System.out.println("Enter the array element");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += arr[i] ^ arr[j];
            }
        }
        System.out.println("Sum of XOR pair: " + sum);

    }
}
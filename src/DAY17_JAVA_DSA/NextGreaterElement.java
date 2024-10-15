package DAY17_JAVA_DSA;

import java.util.*;

/**
 * NextGreaterElement
 */
public class NextGreaterElement {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr");
        n = sc.nextInt();
        System.out.println("Enter the array Element");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int res[] = nextgreaterelement(arr);
        System.out.println(Arrays.toString(res));
        sc.close();
    }

    public static int[] nextgreaterelement(int arr[]) {
        int n = arr.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty())
                res[i] = -1;
            else
                res[i] = st.peek();

            st.push(arr[i]);
        }

        return res;
    }
}
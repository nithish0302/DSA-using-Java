package DAY3_JAVA_DSA;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 8, 1 };
        int value = 8;
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            flag = 0;
            if (arr[i] == value) {
                flag = 0;
                System.out.println("Vlaue found at index:" + i);
                break;
            } else
                flag = 1;
        }
        if (flag == 1)
            System.out.println("Value not in array");
    }
}

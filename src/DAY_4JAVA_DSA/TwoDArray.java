package DAY_4JAVA_DSA;

import java.util.*;
        
public class TwoDArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       
        System.out.println("Enter the row size");
        int row = sc.nextInt();
        System.out.println("Enter the col size");
        int col = sc.nextInt();
        int arr[][] = createArray(row, col);

        // modify
        System.out.println("Enter the row size");
        int row1 = sc.nextInt();
        System.out.println("Enter the col size");
        int col1 = sc.nextInt();
        System.out.println("Enter the value");
        int n = sc.nextInt();
        modify(arr, row1, col1, n);
        // sum
        int sum = sum(arr);
        System.out.println("Sum is:" + sum);
        System.out.println("Array Element");

        // print array
        print(arr);
        System.out.println("The max value is:");

        // Max
        int max = max(arr);
        System.out.println(max);

        // Min
        int min = min(arr);
        System.out.println("The min value is " + min);

        //Transverse
        transverse(arr);

    }

    public static int[][] createArray(int row, int col) {
     //   Scanner sc = new Scanner(System.in);
        int arr[][] = new int[row][col];
        System.out.println("Enter the array element");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }

        }
        return sum;
    }

    public static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        return max;
    }

    public static int min(int[][] arr) {
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < max)
                    max = arr[i][j];
            }
        }
        return max;
    }

    public static void modify(int[][] arr, int row, int col, int n) {

        if (row >= 0 && row < arr.length && col >= 0 && col < arr[row].length) {
            arr[row][col] = n;
        } else {
            System.out.println("Error: Index out of bounds.");
        }
        print(arr);

    }
    public static void transverse(int arr[][])
    {
        int arr1[][]=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr1[i][j]=arr[j][i];
            }
        }
        System.out.println("The transverse matrix is: ");
        print(arr1);
        sc.close();
    }
}

package DAY5_JAVA_DSA;

import java.util.Scanner;

public class Spiralmatrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the of row size");
        int row = sc.nextInt();
        System.out.println("Enter the col size");
        int col = sc.nextInt();
        int arr[][] = mat(row, col);
        spiral(arr, row, col);
    }

    public static int[][] mat(int row, int col) {
        int arr[][] = new int[row][col];
        System.out.println("Enter the array element");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }

    public static void spiral(int arr[][], int row, int col) {
        int top = 0;
        int bottom = row;
        int left = 0, right = col;
        while (top <= bottom && left <= right) {

            for (int i = left; i < right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            for (int i = top; i < bottom; i++) {
                System.out.print(arr[i][right - 1] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right - 1; i >= left; i--) {
                    System.out.print(arr[bottom - 1][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom - 1; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }

    }

    
}

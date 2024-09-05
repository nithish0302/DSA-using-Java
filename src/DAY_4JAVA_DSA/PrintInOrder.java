package DAY_4JAVA_DSA;

import java.util.Scanner;

public class PrintInOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row size");
        int row = sc.nextInt();
        System.out.println("Enter the col size");
        int col = sc.nextInt();
        int arr[][] = arrayi(row, col);
        spiral(arr, row, col);

    }

    public static int[][] arrayi(int row, int col) {
        Scanner sc = new Scanner(System.in);
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
    
        System.out.println("The pattern is");
        for(int j=0;j<col;j++)
        {
            if(j%2==0)
            {
                for(int i=0;i<row;i++)
                {
                    System.out.println(arr[i][j]);
                }
            }
            else
            {
                for(int i=row-1;i>=0;i--)
                {
                    System.out.println(arr[i][j]);
                }
            }
        }

    }
}

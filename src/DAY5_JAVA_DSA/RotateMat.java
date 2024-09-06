package DAY5_JAVA_DSA;

import java.util.Scanner;

public class RotateMat {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the row size");
        int row=sc.nextInt();
        System.out.println("Enter the col size");
        int col=sc.nextInt();
        int arr[][]=mat(row, col);
        print(arr, row, col);

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
    public static void print(int arr[][],int row,int col)
    {
        int top=0,bottom=row-1,left=0,right=col-1;
        while(top<=bottom && left<=right)
        {
        for(int i=bottom;i>=top;i--)
        {
           System.out.print(arr[i][left]+" "); 
        }
        left++;
        bottom=row-1;
        System.out.println();
    }
    }
}

package DAY_4JAVA_DSA;
import java.util.*;
public class MatrixMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix1 row");
        int row=sc.nextInt();
        System.out.println("Enter the matrix1 col");
        int col=sc.nextInt();
        int arr1[][]=mat(row, col);
        System.out.println("Enter the matrix2 row");
        int row1=sc.nextInt();
        System.out.println("Enter the matrix2 col");
        int col1=sc.nextInt();
        int arr2[][]=mat(row1, col1);
        mul(arr1,row,col,arr2,row1,col1);
    }
    public static int[][] mat(int row,int col)
    {   Scanner sc = new Scanner(System.in);
        int arr[][]=new int[row][col];
        System.out.println("Enter the array element");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    public static void mul(int arr[][],int row,int col,int arr2[][],int row1,int col1)
    {
        int arr3[][]=new int[row][col1];
        if(row==col1 && col==row1)
        {
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col1;j++)
                {
                    arr3[i][j]=0;
                    {
                        for(int k=0;k<col;k++)
                        {
                            arr3[i][j]=arr[i][k]*arr2[k][j];
                        }
                    }
                }
            }
        }
        print(arr3);
    }
    public static void print(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

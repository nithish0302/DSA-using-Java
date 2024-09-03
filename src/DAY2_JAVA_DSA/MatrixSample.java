package DAY2_JAVA_DSA;

public class MatrixSample {
    public static void main(String[] args) {
        
    
    int n=3;
    int[][] matrix=new int[n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            matrix[i][j]=(i+1)*(j+1);

        }
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
}
}


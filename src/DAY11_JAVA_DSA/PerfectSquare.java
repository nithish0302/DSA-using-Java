package DAY11_JAVA_DSA;

import java.util.*;

public class PerfectSquare {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the n value");
        int n = sc.nextInt();
        // boolean flag=false;

        // for(int i=1;i<n/2;i++)
        // {
        // if(i*i==n)
        // {
        // System.out.println("Yes");
        // flag=true;
        // }
        // }
        // if(flag==false)
        // System.out.println("No");
        String str = perfect(n, 0, n);
        System.out.println(str);
    }

    static String perfect(int n,int low,int high)
    {
        if(n==1)
        return "Yes";
        if(low<=high)
        {
            int mid=(low+high)/2; 
            if(mid*mid==n)
            {
                return "Yes";
            }   
            else if(mid*mid>n)
            {
               return perfect(n, low, mid-1);
            }
            else
            {
              return perfect(n, mid+1, high);
            }
        }
        return "No";
    }
}

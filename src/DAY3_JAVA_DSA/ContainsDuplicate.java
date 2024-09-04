package DAY3_JAVA_DSA;

import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {
      System.out.println("Enter the n size");
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int [n];
     System.out.println("Enter the array element");
     for(int i=0;i<n;i++)
     {
        arr[i]=sc.nextInt();
     }
     boolean flag=false;
     for(int i=0;i<n;i++)
     {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]==arr[j])
            {
                flag=true;
                break;
            }
        }
     }
     if(flag==true)
     {
        System.out.println("Found");
     }
     else
     {
        System.out.println("Not Found");
     }
    }
}

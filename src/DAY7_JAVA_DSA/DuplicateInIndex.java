package DAY7_JAVA_DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateInIndex {
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("Enter the array size");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the array element");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            List<Integer>li=new ArrayList<>();
            for(int i=0;i<arr.length;i++)
            {
                int index=Math.abs(arr[i])-1;
                
                if(arr[index]<0)
                {
                    li.add(index+1);    
                }
                arr[index]=-arr[index];
            }
            System.out.println(li);
        }
}

package DAY7_JAVA_DSA;

import java.util.Scanner;

public class PrintInPatternUsingRecurssion {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the n size");
        int n=sc.nextInt();
        rec3(n);
    }

    public static void rec(int n)
    {
        if(n>0)
        {
            System.out.println(n);
            rec(n-1);
        }
    }

    public static void rec1(int n)
    {
        
        if(n>0)
        {
            rec1(-1);
            System.out.println(n);
            
        }
    }
    public static void rec3(int n)
    {
        if(n>0)
        {
        System.out.println(n);
        rec3(n-1);
        System.out.println(n);
        }
    }

}

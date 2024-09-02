package JAVA_DSA;

import java.util.Scanner;

public class PostiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        if(n>0)
        {
            System.out.println("The given nuber is Positive");
        }
        else if(n==0)
        {
            System.out.println("The given number is Zero");
        }
        else
        {
            System.out.println("The given number is Negative");
        }
    }
}

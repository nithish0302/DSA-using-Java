package DAY1_JAVA_DSA;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("The given number is even");
        }
        else{
            System.out.println("The given number is odd");
        }
        sc.close();
    }
}

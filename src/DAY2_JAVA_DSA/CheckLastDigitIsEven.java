package DAY2_JAVA_DSA;

import java.util.Scanner;
public class CheckLastDigitIsEven {
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int la=n%10;
        System.out.println(la%2==0?"Even":"Odd");
        sc.close();
    }
}

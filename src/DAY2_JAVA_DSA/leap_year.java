package DAY2_JAVA_DSA;

import java.util.Scanner;

/**
 * leap year
 */
public class leap_year {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter the year");
        Scanner sc= new Scanner(System.in);
        year=sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0)
        {
            System.out.println("The given year is leap year");
        }
        else{
            System.out.println("The given year is not a leap year");
        }
        sc.close();
    }
    
}
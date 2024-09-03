package DAY1_JAVA_DSA;

import java.util.Scanner;

public class Student_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Grade");
        int score=sc.nextInt();
        if(score>=90)
        {
            System.out.println("Student grade is A");
           
        }
        else if(score>=80 && score<=89)
        {
            System.out.println("Student grade is B");
        }
        else if(score>=70 && score<=79)
        {
            System.out.println("Student grade is C");
        }
        else if(score>=60 && score<=69)
        {
            System.out.println("Student grade is D");
        }
        else
        {
            System.out.println("Student grade is F");
        }
      
    }
}

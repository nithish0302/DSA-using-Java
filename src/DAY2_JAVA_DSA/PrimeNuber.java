package DAY2_JAVA_DSA;

import java.util.Scanner;

public class PrimeNuber {
    public static void main(String[] args) {
        int num,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                flag=1;
                break;
            }
            else
            {
                
                continue;
            }
            
         
        }
        if(flag==1)
        {
            System.out.println("It is not prime");
            
        }
        else{
            System.out.println("It is prime");
        }
        sc.close();
    }
}

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        System.out.println("Enter number: ");
        Scanner num = new Scanner(System.in);
        long n = num.nextLong();
        long temp=n;
        long r,d=0,sum=0,m=10;

        while(n>0)
        {
            r=n%10;
            ++d;
            n=n/10;
        }
        if(d==10)
        {
            while(temp>0)
            {
                r = temp % 10;
                sum = sum + (r * m);
                --m;
                temp = temp / 10;
            }
            if(sum%11==0)
            {
                System.out.println("ISBN number");
            }
            else
            {
                System.out.println("Not an ISBN number");
            }
        }
        else
        {
            System.out.println("Not 10 digits");
        }
    }
}

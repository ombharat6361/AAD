package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Enter number to check: ");
        Scanner Number=new Scanner(System.in);
        int n = Number.nextInt();
        int temp=n;
        int r,sum=0;
        while(n>0)
        {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }
        if(sum==temp)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an Armstrong number");
        }
    }
}

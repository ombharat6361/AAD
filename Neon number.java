package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        System.out.println("Enter number: ");
        Scanner num=new Scanner(System.in);
        int n = num.nextInt();
        int r, sum=0,sq;
        sq=n*n;
        while(sq>0)
        {
            r = sq % 10;
            sum = sum + r;
            sq = sq / 10;
        }
        if(sum==n)
        {
            System.out.println("Neon number");
        }
        else
        {
            System.out.println("Not a neon number");
        }

    }
}

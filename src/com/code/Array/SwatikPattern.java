package com.code.Array;

import java.util.Scanner;

public class SwatikPattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.print("*");
        for(int i=0;i<number-2;i++)
        {
            System.out.print(" ");
        }
        for (int i=0;i<number;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int j=0;j<number-2;j++)
        {
            System.out.print("*");
            for(int i=0;i<number-2;i++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i=0;i<2*number-1;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int i=0;i<number-2;i++)
        {
            for(int j=0;j<=number-2;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0;j<number-2;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i=0;i<number;i++)
        {
            System.out.print("*");
        }
        for(int i=0;i<number-2;i++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
    }
}

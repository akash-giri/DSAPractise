package com.code.recursion;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int i=0;
        for(int j=1;j<=number;j++)
        {
            System.out.println(Fibonacci(i));
            i++;
        }
    }
    public static int Fibonacci(int n)
    {
        if ( n == 0 )
            return 0;
        else if ( n == 1 )
            return 1;
        else
            return ( Fibonacci(n-1) + Fibonacci(n-2) );
    }

}
 //0 1 1 2
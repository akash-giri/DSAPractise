package com.code.recursion;

public class PrintDecreasingNumber {
    public static void main(String[] args) {
        int number=10;
        printDecreasingNumber(number);
    }

    static void printDecreasingNumber(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n+" ");
        printDecreasingNumber(n-1);
    }
}

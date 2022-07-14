package com.code.recursion;

public class PrintDecreasingIncreasingNumber {

    public static void main(String[] args) {
        int number=4;
        printDecreasingIncreasing(number);
    }
    static void printDecreasingIncreasing(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n+" ");
        printDecreasingIncreasing(n-1);
        System.out.print(n+" ");
    }
}

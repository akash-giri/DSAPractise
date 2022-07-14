package com.code.recursion;

public class PrintIncreasingnumber {

    public static void main(String[] args) {
        int number=10;
        printIncreasing(number);
    }
    static void printIncreasing(int n)
    {
        if(n==0)
        {
            return;
        }
        printIncreasing(n-1);
        System.out.print(n+" ");
    }
}

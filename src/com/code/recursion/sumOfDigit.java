package com.code.recursion;

public class sumOfDigit {
    static int sumDigit(int number)
    {
        if(number==0)
        {
            return 0;
        }
        return (number%10+sumDigit(number/10));
    }

    public static void main(String[] args) {
        System.out.println(sumDigit(1589));
    }
}

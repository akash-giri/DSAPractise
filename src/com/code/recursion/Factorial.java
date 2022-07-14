package com.code.recursion;

public class Factorial {
    static int Fact(int number)
    {
        int f=number;
        if(f==1)
        {
            return 1;
        }
        return f*Fact(number-1);
    }

    public static void main(String[] args) {
        System.out.println(Fact(4));
    }
}

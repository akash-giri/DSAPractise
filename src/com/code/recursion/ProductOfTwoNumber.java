package com.code.recursion;

public class ProductOfTwoNumber {

    static  int sum=0;
    static int product(int x,int y)
    {
        if(y>0) {
            sum = sum + x;
            return product(x, y-1);
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum=0;
        System.out.println(product(4,3));
    }
}

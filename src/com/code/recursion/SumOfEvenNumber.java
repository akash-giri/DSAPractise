package com.code.recursion;

public class SumOfEvenNumber {

    static int sumOfEvenNumbers(int x,int number)
    {
        if(x>number)
        {
            return 0;
        }
        return x+sumOfEvenNumbers(x+2,number);
    }

    public static void main(String[] args) {
        System.out.println(sumOfEvenNumbers(2,5));
    }

}


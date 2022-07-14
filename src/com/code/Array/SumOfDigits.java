package com.code.Array;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfTestcases=sc.nextInt();
        while (numberOfTestcases>0)
        {
            int number=sc.nextInt();
            int sum=0;
                while (number>0)
                {
                   int rem=number%10;
                   sum=sum+rem;
                   number=number/10;
                }
                System.out.println(sum);
            numberOfTestcases--;
        }
    }
}

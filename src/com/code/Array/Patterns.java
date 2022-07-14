package com.code.Array;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();
      //  count(1,105);

        for(int i=1;i<=number;i++)
        {
            primes(i);
        }

    }
    public static void count(int number,int digit)
    {
        while (number>0)
        {
            int num=0;
            while (digit!=0)
            {
                int rem=digit%10;
                num=num*10+rem;
                digit=digit/10;
            }
            System.out.println(num);

            number--;
        }
    }

    public static void primes(int number)
    {
        for(int i=2;i<number/2;i++)
        {
            if(number%2!=0)
            {
                System.out.println(number);
            }
        }
    }
}

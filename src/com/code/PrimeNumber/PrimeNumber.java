package com.code.PrimeNumber;

import java.util.Arrays;

public class PrimeNumber {

    public static void main(String[] args) {
       int number=100;
//       printPrimeNumber(number);
        printPrimeNumber2(number);
//       if(primeNumber1(number))
//       {
//           System.out.println(number+ "is prime");
//       }else{
//           System.out.println(number+"is not prime");
//       }
    }

    /**
     * O(n) approach
     */
    static boolean primeNumber(int number)
    {
        if(number==0||number==1)
        {
            return false;
        }
        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    /**
     * O(sqrt(n))
     */
    static boolean primeNumber1(int number)
    {
        if(number==0||number==1)
        {
            return false;
        }
        for(int i=2;i*i<=number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    /**
     * print all prime number to given number
     * tc-O(n(sqrt(n))
     */

    static void printPrimeNumber(int number)
    {
        for(int i=2;i<=number;i++)
        {
            if(primeNumber1(i))
            {
                System.out.println(i);
            }
        }
    }
    /**
     * n*log(log(n))  -seive algorithm multiples of given number avoid or not count
     */
    static void printPrimeNumber2(int number)
    {
        boolean[] primes=new boolean[number+1];
        Arrays.fill(primes, Boolean.TRUE);

        primes[0]=false;
        primes[1]=false;
        for(int i=2;i*i<=number;i++)
        {
            if(primes[i])
            {
                for(int j=i*i;j<number;j+=i)
                {
                    primes[j]=false;
                }
            }
        }
        for(int i=2;i<number;i++)
        {
            if(primes[i])
            {
                System.out.println(i);
            }
        }
    }

}

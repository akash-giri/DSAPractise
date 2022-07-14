package com.code.Array;

import java.util.HashSet;

public class DistinctPrimes {

    public static void main(String[] args) {
        int[] array={1, 2, 3, 4};
        int prod=1;
        for(int i=0;i< array.length;i++)
        {
            prod*=array[i];
        }
        System.out.print(distinctPrimeDivisors(prod));

    }

    static boolean isPrime(int number)
    {
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int distinctPrimeDivisors(int n)
    {
        HashSet<Integer> set=new HashSet<>();
        for (int i = 2;i <= n; i++)
        {
            if (n % i == 0)
            {
                if (isPrime(i))
                    set.add(i);
            }
        }
        return set.size();
    }

}

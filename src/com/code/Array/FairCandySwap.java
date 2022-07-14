package com.code.Array;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {

    public static void main(String[] args) {
        int[] A={1,2};
        int[] B={2,3};
        int[] result=fairCandySwap(A,B);
        for(int i=0;i< result.length;i++)
        {
            System.out.print(result[i]+" ");
        }

    }

    static public int[] fairCandySwap(int[] A, int[] B) {
        int sum1 = 0, sum2 = 0;
        for (int x: A) sum1 += x;
        for (int x: B) sum2 += x;
        int difference = (sum2 - sum1) / 2;

        Set<Integer> setB = new HashSet();
        for (int x: B) setB.add(x);

        for (int x: A)
            if (setB.contains(x + difference))
                return new int[]{x, x + difference};

        return new int[]{};
    }
}

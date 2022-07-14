package com.code.Array.SubArraysProblems;

import java.util.HashMap;

public class CountAllSubArrayWithZeroSum {

    static int CountSubarrayWithZeroSum(int[] arr)
    {
        int count  = 0;
        HashMap< Integer, Integer> hmap = new HashMap< >();
        int i = -1;
        int sum = 0;
        hmap.put(sum, i);

        while (i < arr.length - 1) {

            i++;
            sum += arr[i];

            if (hmap.containsKey(sum)) {

                count += hmap.get(sum);
                hmap.put(sum, hmap.get(sum) + 1);
            } else {
                hmap.put(sum, 1);
            }
        }
        return count;
    }
}

package com.code.Array.SubArraysProblems;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int[] newarray=new int[]{1, 2, 3, 4, 5};
        if(subArrayExists(newarray))
        {
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
    /**
     * time complexity O(n) and space (n)
     * @param arr
     * @return
     */
    static Boolean subArrayExists(int arr[])
    {
        // Creates an empty hashset hs
        Set<Integer> hs = new HashSet<Integer>();
        // Initialize sum of elements
        int sum = 0;
        // Traverse through the given array
        for (int i = 0; i < arr.length; i++)
        {
            // Add current element to sum
            sum += arr[i];
            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash map
            if (arr[i] == 0
                    || sum == 0
                    || hs.contains(sum))
                return true;
            // Add sum to hash set
            hs.add(sum);
        }
        // We reach here only when there is
        // no subarray with 0 sum
        return false;
    }
}

package com.code.Array;

import java.util.*;

public class FindDuplicateNumberInArray {

    public static void main(String[] args) {
        int[] array=new int[]{1, 2, 3, 1, 3, 6, 6,4,4,5,7,7,7,8,9,10,11,12,13,10,10,2,11,15,1,5,15,14,14,11,
        12,12,13,17,28,18,19,20,21,22,23,24,25,26,27,28,29,30,30,30,17,17};
        int n=array.length;
        ArrayList<Integer>result=duplicates(array,n);
        for(int i=0;i< result.size();i++)
        {
            System.out.println(result.get(i));
        }
    }

    /**
     * one approach by using set
     * time complexity O(n) and space O(n) without modifying the array
     */
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1;
    }

    /**
     * another approach
     * time complexity O(n) and space O(1) without modifying the array
     */

    public int findDuplicateAnotherApproach(int[] nums) {
        // Find the intersection point of the two runners.
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Find the "entrance" to the cycle.
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;
    }

    /**
     * another approach
     * time complexity O(n) and space O(1) by modifying the array
     * find the duplicates in the array
     * Traverse the given array from start to end.
     * For every element in the array increment the arr[i]%n‘th element by n.
     * Now traverse the array again and print all those indexes i for which arr[i]/n is greater
     * than 1. Which guarantees that the number n has been added to that index
     * This approach works because all elements are in the range from 0 to n-1 and arr[i]
     * would be greater than n only if a value “i” has appeared more than once.
     */
    public void  numberRepeating(int numRay[], int size)
    {
        for (int i = 0; i < numRay.length; i++) {
            numRay[numRay[i] % numRay.length]
                    = numRay[numRay[i] % numRay.length]
                    + numRay.length;
        }
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < numRay.length; i++) {
            if (numRay[i] >= numRay.length * 2) {
                System.out.println(i + " ");
            }
        }
    }
    static void printRepeating(int arr[], int n)
    {
        // First check all the values that are
        // present in an array then go to that
        // values as indexes and increment by
        // the size of array
        for (int i = 0; i < n; i++)
        {
            int index = arr[i] % n;
            arr[index] += n;
        }

        // Now check which value exists more
        // than once by dividing with the size
        // of array
        for (int i = 0; i < n; i++)
        {
            if ((arr[i] / n) >= 2)
                System.out.print(i + " ");
        }
    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        boolean flag = false;

        //occurance
        for (int i=0; i<n; i++) {
            if (!map.containsKey(arr[i]))
                map.put(arr[i], 1);
            else
                map.put(arr[i], map.get(arr[i]) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                res.add(entry.getKey());
                flag = true;
            }
        }

        if (!flag) {
            res.add(-1);
            return res;}

//        Collections.sort(res);
        return res;
    }
}


package com.code.Array;

import java.util.Scanner;

public class BuildArrayFromPermutation {
    /**
     * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
     *
     * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
     * Input: nums = [0,2,1,5,3,4]
     * Output: [0,1,2,4,5,3]
     * Explanation: The array ans is built as follows:
     * ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
     *     = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
     *     = [0,1,2,4,5,3]
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int sizeOfArray=sc.nextInt();
        int[] nums=new int[sizeOfArray];
        System.out.println("Enter the number of elements in array: ");
        for(int i=0;i< nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        int[] newArray=buildArray(nums);
        System.out.println("new array after build functions call :");
        for(int i=0;i< newArray.length;i++)
        {
            System.out.print(newArray[i]+" ");
        }
    }
    static int[] buildArray(int[] nums) {
        int[] array=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            array[i]=nums[nums[i]];
        }
        return array;
    }
}

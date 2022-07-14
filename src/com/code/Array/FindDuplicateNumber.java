package com.code.Array;

public class FindDuplicateNumber {

    public static void main(String[] args) {
       int[] nums=new int[]{1,3,4,2,2};
                   // 1,-3,-4,-2,-2
        System.out.println(duplicate(nums));
    }

    static int duplicate(int[] nums)
    {
        int value =0;
        for(int i=0;i<nums.length;i++) {
            if (nums[Math.abs(nums[i])] >=0){
                nums[Math.abs(nums[i])] = - nums[Math.abs(nums[i])];
            }
            else
            {
                value = Math.abs(nums[i]);
            }
        }

        return  value;
    }
}

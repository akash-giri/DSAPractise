package com.code.Array.SubArraysProblems;

public class MaximumProductSubArray {

    /**
     * time complexity O(n) and space (1)
     * @param x
     * @param y
     * @return
     */
    public static int maxSubarrayProduct(int[] nums){
    int ans=Integer.MIN_VALUE,temp=1;
    for(int i=0;i<nums.length;i++){
        temp*=nums[i];
        ans=Math.max(ans,temp);
        if(temp==0)
            temp=1;
    }
    temp=1;
    for(int i=nums.length-1;i>=0;i--){
        temp*=nums[i];
        ans=Math.max(ans,temp);
        if(temp==0)
            temp=1;
    }
     return ans;

    }

    public static int maxSubArrayProduct(int[] nums)
    {
        int max = Integer.MIN_VALUE, temp = 1;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            if (max < temp)
                max = temp;
            for (int j = i + 1; j < nums.length; j++) {
                temp *= nums[j];
                if (max < temp)
                    max = temp;
            }
        }
        return max;
    }

    // Driver Code
    public static void main(String[] args)
    {

        int arr[] = { 6, -3, -10, 0, 2};
        System.out.println("Maximum Sub array product is "
                + maxSubarrayProduct(arr));
    }
}

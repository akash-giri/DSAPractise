package com.code.Array;

public class HouseRobber {

    public static void main(String[] args) {
        System.out.println(Rob(new int[]{1,2,3,1}));

    }
    public static int Rob(int[] nums) {
        int n=nums.length;
        int max1=0;
        int max2=0;
        for(int i=0;i<n;i=i+2)
        {
            max1=max1+nums[i];
        }
        for(int i=1;i<n-1;i=i+2)
        {
            max2=max2+nums[i];
        }
        if(max1>max2)
        {
            return max1;
        }
        else{
            return max2;
        }
    }
}

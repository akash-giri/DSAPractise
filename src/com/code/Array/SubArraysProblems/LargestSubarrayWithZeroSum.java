package com.code.Array.SubArraysProblems;

import java.util.HashMap;

public class LargestSubarrayWithZeroSum {

    public static int largestSubarraywithZeroSum(int[] array)
    {
        HashMap<Integer,Integer>hs=new HashMap<>();
        int max=0;
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
            if(sum==0)
            {
                max=i+1;
            }
            else{
                if(hs.get(sum)!=null)
                {
                    max=Math.max(max,i-hs.get(sum));
                }
                else{
                    hs.put(sum,i);
                }
            }
        }
        return max;
    }
}

package com.code.Array.SubArraysProblems;

import java.util.HashMap;

public class CountAllSubArrayWithEqualToK {

    public static void main(String[] args) {
        int[] newArray=new int[]{1,2,1,3};
        int k=3;
        System.out.println(subarraySum(newArray,k));
    }

    public static int subarraySum(int[] nums, int k) {
        int count =0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum =0;

        for( int a: nums ){
            sum += a;

            if(map.containsKey(sum- k) ){
                count += map.get(sum- k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1 );
        }
        return count;
    }
}

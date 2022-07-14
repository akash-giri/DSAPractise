package com.code.Array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber2 {
    public static void main(String[] args) {
        int[] nums={0,1,0,1,0,1,99};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int result=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
               result=  entry.getKey();
            }
        }
        return result;
    }
}

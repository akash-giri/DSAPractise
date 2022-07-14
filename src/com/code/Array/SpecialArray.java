package com.code.Array;

public class SpecialArray {

    public static void main(String[] args) {
        int[] nums={0,4,3,0,4};
        System.out.println(specialArrya(nums));
    }
    static int specialArrya(int[] nums)
    {
        int x = nums.length;
        int[] counts = new int[x+1];

        for(int elem : nums)
            if(elem >= x)
                counts[x]++;
            else
                counts[elem]++;

        int res = 0;
        for(int i = counts.length-1; i > 0; i--) {
            res += counts[i];
            if(res == i)
                return i;
        }

        return -1;
    }
}


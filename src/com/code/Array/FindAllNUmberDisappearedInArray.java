package com.code.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNUmberDisappearedInArray {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer>list=new ArrayList<>();
        int i=0;
        while(i<nums.length-1)
        {
            while(nums[i]!=nums[nums[i]-1])
            {
                int temp=nums[i];
                nums[i]=nums[nums[i]-1];
                nums[nums[i]-1]=temp;
            }
            i++;
        }
        for(int j=0;j<nums.length-1;j++)
        {
            if(nums[j]!=nums[nums[j]-1])
            {
                list.add(j);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] array={1,1};
        System.out.println(findDisappearedNumbers(array));
    }
}

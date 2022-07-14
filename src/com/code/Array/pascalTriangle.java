package com.code.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascalTriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>>result=new ArrayList<>();
        if(numRows==0) return result;

        List<Integer> res=new ArrayList<>();
        res.add(1);
        result.add(res);
        for(int i=1;i<numRows;i++)
        {
            List<Integer>row =new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++)
            {
                row.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
      //  System.out.println(generate(5));
       int[] array=new int[]{};
       threeSum(array);
    }

    public static void threeSum(int[] nums)
    {
        int [] array=new int[]{ };
        if(nums.length<2)
        {
            System.out.println(array[0]);
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<=nums.length-2;j++)
            {
                if(nums[i]+nums[j]+nums[j+1]==0)
                {
                    System.out.println(nums[i]+" "+nums[j]+" "+nums[j+1]);
                }
            }
        }
    }


}

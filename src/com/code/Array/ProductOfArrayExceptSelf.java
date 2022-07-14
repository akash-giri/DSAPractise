package com.code.Array;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] newArray=new int[]{1,2,3,4};
        int[] array=productExceptSelf(newArray);
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i]+" ");
        }

    }
    public static int[] productExceptSelf(int[] nums) {
        int mul=1;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                mul=mul*nums[i];
            }
            else{
                count++;
            }
        }

        if(count>=2)
        {
            for(int i=0;i<nums.length;i++)
            {
                nums[i]=0;
            }
            return nums;
        }
        else{
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]!=0 && count==0)
                {
                    nums[i] = mul/nums[i];
                    //System.out.println(nums[i]);
                }
                if(nums[i]!=0 && count==1)
                {
                    nums[i]=0;
                }
                else{
                    nums[i]=mul;
                }
            }
            return nums;
        }

    }
}

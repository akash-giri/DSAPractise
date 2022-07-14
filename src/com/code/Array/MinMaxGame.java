package com.code.Array;

public class MinMaxGame {

    public static void main(String[] args) {
       int[] nums=new int[]{1,3,5,2,4,8,2,2};
        System.out.println(minMaxGame(nums));
    }
    public static int minMaxGame(int[] nums)
    {
//        int[] newNums=new int[nums.length/2];
//        newNums[N/2];   [1,5,4,2]
        int N= nums.length/2;
        while(N>0){
            int[] newNums=new int[N];
            int k=0;
            for(int i=0;i<N;i++)
            {
                if(i%2==0)
                {
                    newNums[k++]=Math.min(nums[2*i],nums[2*i+1]);
                }else{
                    newNums[k++]=Math.max(nums[2*i],nums[2*i+1]);
                }
            }
             nums=newNums;
            N=nums.length/2;
        }
        return nums[0];
    }
}

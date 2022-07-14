package com.code.SearchingAndSorting.searching;

public class SingleElementInSortedArray {

    public static void main(String[] args) {
//        int[] nums={1,1,2,3,3,4,4,8,8};
        int[] nums={3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            if(nums[l+1]==nums[l]){
                l=l+2; // skip duplicate elements
            }else{
                return nums[l];
            }

            if(nums[r]==nums[r-1]){
                r=r-2; // skip duplicate elements
            }else{
                return nums[r];
            }
        }
        return nums[l];
    }
}

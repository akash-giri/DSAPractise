package com.code.SearchingAndSorting.searching;

public class SearchInRotatedsortedArray {

    public static void main(String[] args) {
//        int[] a={4,5,6,7,0,1,2};
//        int target=0;
        int[] a={4,5,6,7,0,1,2};
        int target=3;
        System.out.println(search(a,target));
    }

    public static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                return mid;
            }else if(nums[mid]>target)
            {
                start=mid-1;
            }else{
                end=mid;
            }
        }
        return -1;
    }
}

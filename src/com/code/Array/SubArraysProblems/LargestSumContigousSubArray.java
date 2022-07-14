package com.code.Array.SubArraysProblems;

public class LargestSumContigousSubArray {

    /** time complexity o(n) and space O(1)
     * arr[] = {1,2,3,-2,5}
     **/
    public static int largestSumContigousSubArray(int []arr,int n){
        int max_so=Integer.MIN_VALUE,maxend=0;
        for(int i=0;i<n;i++){
            maxend+=arr[i];
            if(max_so<maxend){
                max_so=maxend;
            }
            if(maxend<0){
                maxend=0;
            }
        }
        return max_so;
    }

    public static void main(String[] args) {
        int []array=new int[]{-1,-2,-3,-4};
        int n= array.length;
        System.out.println(largestSumContigousSubArray(array,n));
    }
}

package com.code.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubSequence {

    /**
     * time complexity O(n) and space O(n)
     * arr[]={2,6,1,9,4,5,3}
     * @param arr
     * @param N
     * @return
     */

    static int findLongestConseqSubseq(int arr[], int N)
    {
        int i;
        int longSequence=0;
        Set<Integer> list=new HashSet<>();
        Arrays.sort(arr);
        //{1,2,3,4,5,6,9}
        for(i=0;i<N;++i){
            list.add(arr[i]);
        }
        for(i=0;i<N;++i){
            if(!list.contains(arr[i]-1)){
                int j=arr[i];
                while(list.contains(j))
                    j++;
                if(longSequence<j-arr[i]){
                    longSequence=j-arr[i];
                }
            }
        }
        return longSequence;
    }

    public static void main(String[] args) {
        int arr[]=new int[]{2,6,1,9,4,5,3};
        int n= arr.length;
        findLongestConseqSubseq(arr,n);
    }
}

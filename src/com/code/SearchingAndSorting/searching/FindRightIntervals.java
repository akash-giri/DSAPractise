package com.code.SearchingAndSorting.searching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindRightIntervals {
    public static void main(String[] args) {
        int[][] intervals={{1,4},{2,3},{3,4}};
        int[] result=findRightInterval(intervals);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }

    public static int[] findRightInterval(int[][] intervals) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=intervals.length;
        int [] first=new int[n];
        for(int i=0;i<n;i++){
            map.put(intervals[i][0],i);
            first[i]=intervals[i][0];
        }
        Arrays.sort(first);
        int [] ans=new int[n];
        for(int i=0;i<n;i++){
            int key=binarySearch(first,intervals[i][1]);
            if(key==first.length)
                ans[i]=-1;
            else if(key==0){
                if(intervals[i][1]<=first[0])
                    ans[i]=map.get(first[0]);
                else
                    ans[i]=-1;
            }
            else{
                ans[i]=map.get(first[key]);
            }
        }
        return ans;
    }
    public static int binarySearch(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return start;
    }
}

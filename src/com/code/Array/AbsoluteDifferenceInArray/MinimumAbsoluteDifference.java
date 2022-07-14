package com.code.Array.AbsoluteDifferenceInArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
//        int[] array=new int[]{4,2,1,3};
        int[] array=new int[]{1,3,6,10,15};
        List<List<Integer>>lst=minimumAbsDifference(array);
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            min=Math.min(min,arr[i+1]-arr[i]);
        }
        for(int i=0;i<arr.length-1;i++){
            if((arr[i+1]-arr[i])==min){
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return list;
    }

}

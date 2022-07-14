package com.code.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

public class ReplaceArrayInElement {

    public static void main(String[] args) {
       int[] nums={1,2,4,6};
       int[][] operations={{1,3},{4,7},{6,1}};
       int[] resultValue=replaceElementusingHashMap(nums,operations);
       for(int i=0;i< resultValue.length;i++)
       {
           System.out.print(resultValue[i]+" ");
       }
    }
    public static int[] replaceElements(int[] nums,int[][] operations)
    {
        int[] arr = new int[1000001];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]] = i;
        }
        for(int i=0;i<operations.length;i++){
            int a = arr[operations[i][0]];
            nums[a] = operations[i][1];
            arr[operations[i][1]] = a;
        }
        return nums;
//        HashSet<Integer> set=new LinkedHashSet<>();
//        for (int element : nums) {
//            set.add(element);
//        }
//        for(int i=0;i< operations.length;i++)
//        {
//            if(set.contains(operations[i][0]))
//            {
//                set.remove(operations[i][0]);
//                set.add(operations[i][1]);
//            }
//        }
//
//        int[] y = new int[set.size()];
//        int c = 0;
//        for(int x : set) y[c++] = x;
//        // toArray() method converts the set to array
//        return y;

    }
    static int[] replaceElementusingHashMap(int[] nums,int[][] operations)
    {
        Map<Integer, Integer> valIndexMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            valIndexMap.put(nums[i],i);
        }
        for(int [] operation: operations){
            int index = valIndexMap.get(operation[0]);
            nums[index] = operation[1];
            valIndexMap.remove(operation[0]);
            valIndexMap.put(nums[index], index);
        }
        return nums;
    }
}

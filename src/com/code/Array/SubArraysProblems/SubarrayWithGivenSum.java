package com.code.Array.SubArraysProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SubarrayWithGivenSum {

    public static void main(String[] args) {
        int[] array=new int[]{42, 9, 38, 36, 48, 33, 36, 50, 38, 8, 13, 37, 33, 38, 17, 25, 50, 50, 41, 29, 34, 18, 16, 6, 49, 16, 21, 29, 41, 7, 37, 14, 5, 30, 35, 26, 38, 35, 9, 36, 34, 39, 9, 4, 41, 40, 3, 50, 27, 17, 14, 5, 31, 42, 5, 39, 38, 38, 47, 24, 41, 5, 50, 9, 29, 14, 19, 27, 6, 23, 17, 1, 22, 38, 35, 6, 35, 41, 34, 21, 30, 45, 48, 45, 37};
//        int n=array.length;
        int s=100;
//        int[] newarray=subarrayPartTwo(array,s);
        int[] newarray=subArrayPartThree(array,s);
        for(int i=0;i< newarray.length;i++)
        {
            System.out.print(newarray[i]+" ");
        }
//        usingPrefixSum(array,n,s);
//      ArrayList<Integer>sum=subarraySum(array,n,s);
//      for (int i=0;i<sum.size();i++)
//      {
//          System.out.print(sum.get(i)+" ");
//      }
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        /**
         * time complexity is O(n) and space complexity is 1.
         */
        ArrayList<Integer> a = new ArrayList<>();
        int start = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (s - sum == arr[i]) {
                a.add(start + 1);
                a.add(i + 1);
                return a;
            } else if (s - sum < arr[i]) {
                i = start;
                start++;
                sum = 0;
            } else {
                sum += arr[i];
            }
        }
        a.add(-1);
        return a;
    }
    static void usingPrefixSum(int[] arr,int n,int s)
    {
        int[] prefixSum=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            prefixSum[i]=sum;
        }
        System.out.println("hold");
    }

    static int[] subarrayPartTwo(int[] arr,int sum)
    {
        long curr_sum = arr[0];
        int ans[]= {-1}, start = 0, i;
        // Pick a starting point
        for (i = 1; i <=arr.length; i++) {
            // If curr_sum exceeds the sum,
            // then remove the starting elements
            while (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            // If curr_sum becomes equal to sum,
            // then return true
            if (curr_sum == sum) {
                return Arrays.copyOfRange(arr, start, i);
            }

            // Add this element to curr_sum
            if (i < arr.length)
                curr_sum = curr_sum + arr[i];
        }
        return ans;
    }
    static int[] subArrayPartThree(int[] arr,int sum){
        int cur_sum = 0;
        int start = 0;
        int end = -1;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            cur_sum = cur_sum + arr[i];

            if (cur_sum - sum == 0) {
                start = 0;
                end = i;
                break;
            }

            if (hashMap.containsKey(cur_sum - sum)) {
                start = hashMap.get(cur_sum - sum) + 1;
                end = i;
                break;
            }

            hashMap.put(cur_sum, i);

        }

        int[] Array1=new int[Math.abs(end-start)+1];
        if (end == -1) {
            return new int[]{end};
        } else {

            int j=0;
            for(int i=start;i<=end;i++)
            {
                Array1[j++]=arr[i];

            }
            return Array1;
        }
    }
}

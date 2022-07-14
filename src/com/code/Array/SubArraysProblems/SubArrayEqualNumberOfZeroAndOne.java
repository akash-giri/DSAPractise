package com.code.Array.SubArraysProblems;

import java.util.HashMap;
import java.util.Map;

public class SubArrayEqualNumberOfZeroAndOne {
    public static void main(String[] args) {
        int[] array=new int[]{1,0,0,1,0,1,1};
        int n=array.length;
//        System.out.println(countSubarrWithEqualZeroAndOne(array,n));
        System.out.println(findMaxLength(array));
    }

    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        int subArrayCount=0;
        for(int i=0;i<n;i++)
        {
            int counter=0;
            int counter1=0;
            if(arr[i]==1)
                counter++;
            if(arr[i]==0)
                counter1++;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]==1)
                    counter++;
                if(arr[j]==0)
                    counter1++;
                if(counter==counter1)
                    subArrayCount++;
            }
        }
        return subArrayCount;
    }

    public static int findMaxLength(int[] arr) {


        Map<Integer, Integer> myMap = new HashMap<>();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            // Replacing 0's in array with -1
            if (arr[i] == 0)
                arr[i] = -1;

            sum += arr[i];

            // If sum = 0, it implies number of 0's and 1's
            // are equal from arr[0]..arr[i]
            if (sum == 0)
                count++;

            if (myMap.containsKey(sum))
                count += myMap.get(sum);

            if (!myMap.containsKey(sum))
                myMap.put(sum, 1);
            else
                myMap.put(sum, myMap.get(sum) + 1);
        }
        return count;

    }
}

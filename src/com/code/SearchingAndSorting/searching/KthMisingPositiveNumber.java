package com.code.SearchingAndSorting.searching;

import java.util.HashSet;

public class KthMisingPositiveNumber {

    public static void main(String[] args) {
          int[] arr={2,3,4,7,11};
          int k=5;
//        int[] arr={1,2,3,4};
//        int k=2;
//        System.out.println(findKthPositive(arr,k));
        System.out.println(kthpositive(arr,k));
    }

    /**
     * binary search
     * @param A
     * @param k
     * @return
     */
    static int kthpositive(int[] A,int k)
    {
        int l = 0, r = A.length, m;
        while (l < r) {
            m = (l + r) / 2;
            if (A[m] - 1 - m < k)
                l = m + 1;
            else
                r = m;
        }
        return l + k;
    }

    /**
     * burte force approach
     * @param arr
     * @param k
     * @return
     */
    public static int findKthPositive(int[] arr, int k) {
        int counter=0;
        int ans=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }

        for(int i=1;i<= arr[arr.length-1]+k;i++)
        {
            if(!set.contains(i))
            {
                counter++;
                if(counter==k)
                {
                    ans=i;
                }
            }
        }
        return ans;
    }
}

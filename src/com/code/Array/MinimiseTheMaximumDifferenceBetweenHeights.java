package com.code.Array;

import java.util.Arrays;

public class MinimiseTheMaximumDifferenceBetweenHeights {
    /**  arr{2,6,3,4,7,2,10,3,2,1}
     * output 7
     * time complexity-O(nlogn)
     * @param arr
     * @param n
     * @param k
     * @return
     */

    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);

        int ans = arr[n-1] - arr[0];
        int small = arr[0] + k;
        int big = arr[n-1] - k;

        int min ;
        int max;
        for(int i = 1; i<= n-1; i++)
        {
            if(arr[i] >=k)
            {
                min = Math.min(arr[i]-k,small);
                max = Math.max(arr[i-1]+k, big);
                ans = Math.min(ans, max-min);
            }

        }
        return ans;
    }
}

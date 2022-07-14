package com.code.Array;

public class TrappingRainWater {
    /**
     * time complexity O(n) and space O(1)
     * @param arr
     * @param n
     * @return
     */

    static int trappingWater(int arr[], int n) {
        int left=0;
        int right=n-1;
        int result=0;
        int maxleft=0,maxright=0;
        while(left<right){
            if(arr[left]<=arr[right]){
                if(arr[left]>=maxleft){
                    maxleft=arr[left];
                }
                else{
                    result=maxleft-arr[left];
                }
                left++;
            }
            else{
                if(arr[right]>=maxright)
                    maxright=arr[right];
                else
                    result=maxright-arr[right];

                right--;
            }
        }
        return result;
    }

    /**
     * time complexity O(n) and space O(n)
     * @param A
     * @return
     */
    public int trap(final int[] A) {
        int n=A.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=A[0];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],A[i]);
        }
        right[n-1]=A[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],A[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans+=Math.min(left[i],right[i])-A[i];
        }
        return ans;
    }
}

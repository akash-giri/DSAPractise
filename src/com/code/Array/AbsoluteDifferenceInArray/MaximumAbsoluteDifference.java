package com.code.Array.AbsoluteDifferenceInArray;

public class MaximumAbsoluteDifference {
    public static void main(String[] args) {
        int[] array=new int[]{4,2,1,3};
        System.out.println(maxArr1(array));
    }

    //Brute force approach
    public int maxArr(int[] A) {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;j<A.length;j++)
            {
                int sum=Math.abs(A[i]-A[j])+Math.abs(i-j);
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }

    //optimise approach  O(n)
    public static int maxArr1(int[] A) {

        int mx1 = Integer.MIN_VALUE, mn1 = Integer.MAX_VALUE, mx2 = Integer.MIN_VALUE, mn2 = Integer.MAX_VALUE;
        for(int i = 0; i < A.length; ++i){
            // for eq 1
            mx1 = Math.max(mx1, A[i]+i);
            mn1 = Math.min(mn1, A[i]+i);

            // for eq2
            mx2 = Math.max(mx2, A[i]-i);
            mn2 = Math.min(mn2, A[i]-i);
        }
        int ans1 = mx1 - mn1;
        int ans2 = mx2 - mn2;
        return Math.max(ans1, ans2);
    }
}

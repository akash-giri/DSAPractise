package com.code.Array;

import java.util.Arrays;

public class prefixSum1 {
    /**
     * Count ways to make sum of odd and even indexed elements equal by removing an array element
     * Given an array, arr[] of size N, the task is to find the count of array indices such that
     * removing an element from these indices makes the sum of even-indexed and odd-indexed array
     * elements equal.
     *
     * Return the count of array indices such that removing an element from these indices makes
     * the sum of even-indexed and odd-indexed array elements equal.
     *
     * Input 1:
     * A=[2, 1, 6, 4]
     * Input 2:
     *
     * A=[1, 1, 1]
     *
     *
     * Example Output
     *
     * Output 1:
     * 1
     * Output 2:
     *
     * 3
     * Explanation1
     * Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1].
     * Therefore, the required output is 1.
     *
     * Explanation2
     *
     * Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
     * Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
     * Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
     * Therefore, the required output is 3.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] A=new int[]{0,1,2,3,4,5,6,7};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int[] even=new int[A.length];
        int[] odd=new int[A.length];

        Arrays.fill(even,0);
        Arrays.fill(odd,0);
        even[0]=A[0];
        int evenSum=0;
        int oddSum=0;
        int count=0;
        for(int i=1;i<A.length;i++)
        {
            if(i%2==0)
            {
                even[i]=even[i-1]+A[i];
            }else{
                even[i]=even[i-1];
            }
        }
        for(int i=1;i<A.length;i++)
        {
            if(i%2!=0)
            {
                odd[i]=odd[i-1]+A[i];
            }else{
                odd[i]=odd[i-1];
            }
        }
        for(int i=0;i<A.length;i++)
        {
            if(i%2!=0)
            {
                oddSum+=odd[i]-A[i]+(even[A.length-1]-even[i]);
                evenSum+=even[i]+(odd[A.length-1]-odd[i]);
            }
            if(i%2==0)
            {
                evenSum+=even[i]-A[i]+(odd[A.length-1]-odd[i]);
                oddSum+=odd[i]+(even[A.length-1]-even[i]);
            }
            if(oddSum==evenSum)
            {
                count++;
            }
            oddSum=0;
            evenSum=0;
        }
      return count;
    }
}

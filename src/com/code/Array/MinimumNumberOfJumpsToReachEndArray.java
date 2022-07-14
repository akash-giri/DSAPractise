package com.code.Array;

public class MinimumNumberOfJumpsToReachEndArray {
    /**
     * { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
     * @param arr
     * @return
     */
//    public int minJumps(int[] arr){
//        if (arr.length <= 1)
//            return 0;
//        // Return -1 if not possible to jump
//        if (arr[0] == 0)
//            return -1;
//        // initialization
//        int maxReach = arr[0];
//        int step = arr[0];
//        int jump = 1;
//        // Start traversing array
//        for (int i = 1; i < arr.length; i++) {
//            // Check if we have reached
//// the end of the array
//            if (i == arr.length - 1)
//                return jump;
//            // updating maxReach
//            maxReach = Math.max(maxReach, i + arr[i]);
//            // we use a step to get to the current index
//            step--;
//            // If no further steps left
//            if (step == 0) {
//                // we must have used a jump
//                jump++;
//                // Check if the current
//// index/position or lesser index
//                // is the maximum reach point
//// from the previous indexes
//                if (i >= maxReach)
//                    return -1;
//                // re-initialize the steps to the amount
//                // of steps to reach maxReach from position i.
//                step = maxReach - i;
//            }
//        }
//        return -1;
//    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5 };
        int n= arr.length;
        System.out.println(minJump(arr,n));
    }
    static  int minJump(int[] arr,int n)
    {
        int jumps = 0, maxi = 0, cur = 0;
        for(int i=0; i<n-1; i++) {
            maxi = Math.max(maxi, arr[i] + i);
            if(i == cur) {
                cur = maxi;
                jumps++;
            }
        }
        if(cur < n-1) {
            return -1;
        }
        return jumps;
    }
}

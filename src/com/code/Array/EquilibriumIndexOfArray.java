package com.code.Array;

public class EquilibriumIndexOfArray {

    public static void main(String[] args) {
        int[] A=new int[]{-7, 1, 5, 2, -4, 3, 0};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        if(A.length == 0) return -1;
        int l = A.length;
        int[] left = new int[l];
        int[] right = new int[l];
        left[0] = A[0];
        right[l-1] = A[l-1];

        for(int i = 1; i<l; i++){
            left[i] = A[i] + left[i-1];
            right[l-1-i] = A[l-1-i] + right[l-i];
        }

        for(int i=0; i< l; i++){
            if(left[i] == right[i]) return i;
        }
        return -1;
    }
}

package com.code.SearchingAndSorting.sorting;

public class minimumSwap2 {

    public static void main(String[] args) {
//        int[] a={1, 2, 3, 4, 0};
        int[] a={12,4,2,1};
        System.out.println(solve(a));

    }

    public static int solve(int[] A) {

         int n = A.length;
        int i = 0, swaps = 0;
        while (i < n) {
            if (A[i] == i) {
                ++i;
            } else {
               swap(A, i, A[i]);
                ++swaps;
            }
        }
        return swaps;

    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}

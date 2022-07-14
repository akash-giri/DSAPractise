package com.code.Array;

import java.util.Arrays;
import java.util.List;

public class PickFromBothSides {
    public static void main(String[] args) {
        Integer[] arr = { 18, 11, 16, 19, 11, 9, 8, 15, 3, 10, 9, 20, 1, 19  };
        System.out.println(solve(Arrays.asList(arr), 1));

    }

    public static int solve(List<Integer> A, int B) {

        int n = A.size();

        int result = 0;

        for (int i = 0; i < B; i++) {
            result += A.get(i);
        }

        int sum = result;

        for (int i = 0; i < B; i++) {
            sum -= A.get(B - 1 - i);
            sum += A.get(n - 1 - i);

            result = Math.max(result, sum);
        }

        return result;

    }
}

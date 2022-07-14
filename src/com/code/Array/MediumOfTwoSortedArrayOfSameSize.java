package com.code.Array;

import java.util.Arrays;

public class MediumOfTwoSortedArrayOfSameSize {

    public static int getMedian(int ar1[],
                                int ar2[], int n)
    {
        int j = 0;
        int i = n - 1;
        while (ar1[i] > ar2[j] && j < n && i > -1)
        {
            int temp = ar1[i];
            ar1[i] = ar2[j];
            ar2[j] = temp;
            i--; j++;
        }
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        return (ar1[n - 1] + ar2[0]) / 2;
    }
}

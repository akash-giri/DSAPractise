package com.code.Array;

public class MaximuPopulation {

    public static void main(String[] args) {
        int[][] array=new int[][]{{1950,1961},{1960,1971},{1970,1981}};
        System.out.println(maximumPopulation(array));
    }
    public static int maximumPopulation(int[][] logs) {
        int count;
        int maxPop = 0;
        int minYear = 1950;
        for (int year = 1950; year <= 2050; year++) {
            count = 0;
            for (int j = 0; j < logs.length; j++) {
                if (logs[j][0] <= year && logs[j][1] > year) {
                    count++;
                }
            }
            if (count > maxPop) {
                maxPop = count;
                minYear = year;
            }
        }
        return minYear;
    }
}

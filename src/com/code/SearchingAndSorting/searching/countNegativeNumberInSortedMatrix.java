package com.code.SearchingAndSorting.searching;

public class countNegativeNumberInSortedMatrix {
    public static void main(String[] args) {
        int[][] grid={{4,3,2,-1},
                      { 3,2,1,-1},
                      {1,1,-1,-2},
                      {-1,-1,-2,-3}};
        System.out.println(negativeNumbers(grid));
    }
    static int negativeNumbers(int[][] grid)
    {
        int m = grid.length, n = grid[0].length;
        int r = 0, c = n - 1, cnt = 0;
        while (r < m && c >= 0) {
            if (grid[r][c] < 0) {
                --c;
                cnt += m - r;
            }else {
                ++r;
            }
        }
        return cnt;
    }
}

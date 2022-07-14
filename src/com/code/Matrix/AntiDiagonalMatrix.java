package com.code.Matrix;

import java.util.Arrays;

public class AntiDiagonalMatrix {

    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
       int[][] arr= antiDiagonal(array);

//       for(int i=0;i<arr.length;i++)
//       {
//           for(int j=0;j< arr[0].length;j++)
//           {
//               System.out.print(arr[i][j]);
//           }
//           System.out.println();
//       }
    }


    public static int[][] antiDiagonal(int[][] A) {
            int ans[][] = new int[A.length * 2 - 1][];
            int n = A.length;
            for (int i = 0; i < n; ++i) {
                ans[i] = new int[i + 1];
                for (int j = 0; j <= i; ++j) {
                    ans[i][j] = A[j][i - j];
                }
            }
            for (int i = 1; i < n; ++i) {
                ans[n + i - 1] = new int[n - i];
                int k = n - 1;
                int p = 0;
                for (int j = i; j < n; ++j, --k, ++p) {
                    ans[n + i - 1][p] = A[j][k];
                }
            }
            return ans;
    }
    public int[][] diagonal(int[][] A) {
        int len = A.length;
        int[][] res = new int[2*len-1][];
        int k=0, size = 0;
        int j= 0;
        for (int i=0; i<len; i++) {
            while (j!=-1 && j!=len) {
                res[k++] = new int[++size];
                int x = i-1, y = j+1;
                int n = 0;
                while (x+1<len && y-1>-1) {
                    x++;
                    y--;
                    res[k-1][n++] = A[x][y];
                }
                if (j<len) {
                    j++;
                } else {
                    j--;
                }
            }
            j = len -1;
            size-=2;
        }
        return res;
    }
}

package com.code.Array;

public class RangeSumQuery {
    /**
     * A : [ 4, 5, 6, 9, 4, 1, 8, 3 ]
     * B :
     * [
     *   [2, 4]
     *   [7, 8]
     *   [1, 4]
     *   [1, 6]
     *   [8, 8]
     *   [2, 2]
     *   [4, 8]
     *   [2, 4]
     *   [7, 8]
     *   [6, 7]
     * ]
     * @param args
     */

    public static void main(String[] args) {
        int[] A=new int[]{4, 5, 6, 9, 4, 1, 8, 3 };
        int[][] B=new int[][]{{2, 4},{7, 8},{1, 4},{1, 6},{8, 8},{2, 2},{4, 8},{2, 4},{7, 8},{6, 7}};
        long[] c=rangeSum(A,B);
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
    public static long[] rangeSum(int[] A, int[][] B) {
        long[] prefix=new long[A.length];
        long[] c=new long[B.length];
        prefix[0]=A[0];
        for(int i=1;i<A.length;i++)
        {
            prefix[i]=prefix[i-1]+A[i];
        }
        int k=0;
        for(int i=0;i<B.length;i++)
        {
            int a=B[i][0];
            int b=B[i][1];
            if(a>1)
            {

                c[k++]=prefix[b-1]-prefix[a-2];
            }
            else{
                c[k++]=prefix[b-1];
            }
        }
        return c;
    }
}

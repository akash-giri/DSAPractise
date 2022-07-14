package com.code.Matrix;


public class matrixMultiplication {

    int speed=10;
    public static matrixMultiplication in=new matrixMultiplication();
    public void mul(){
        System.out.println("fitrst");
    }

//    matrixMultiplication(){
//        System.out.println("constructor calling");
//    }
//
//    static {
//        int speed=10;
//        System.out.println("instance initializer block invoked"+speed);
//    }
    public static void main(String[] args) {
       System.out.println(in.speed);
       in.mul();
 //       matrixMultiplication ma = new matrixMultiplication();
//       System.out.println(ma.speed);
//        int[][] A=new int[][]{{62, -37, -49, 18, -53, 14, 51},
//                {20, 78, -29, -49, -17, 21, 83},
//                {-99, -69, -39, -47, 19, -50, -90},
//                {91, -96, 63, -23, 5, 94, 49},
//                {17, 1, 16, 63, -78, -13, -100},
//                {-7, 72, 16, 86, -53, 94, 85},
//                {-82, 78, 96, -45, -42, 38, 34},
//                {-88, 37, 12, 31, -91, 51, 23},
//                {62, -52, -11, -21, -62, -44, -95}};
//
//        int[][] B=new int[][]{{90, 68, 2, 54, -59},
//                {78, -86, 8, -30, 24},
//                {-92, 84, -62, 13, 2},
//                {12, -73, -53, -91, -4},
//                {74, 85, -51, -4, 37},
//                {-30, -27, 10, -78, 29},
//                {-96, 39, -42, 93, 78}};
//
//        int[][] result=solve(A,B);
//        for(int i=0;i<result.length;i++)
//        {
//            for(int j=0;j<result[0].length;j++)
//            {
//                System.out.print(result[i][j]+" ");
//            }
//            System.out.println();
//        }
//        return 0;
    }
    public static int[][] solve(int[][] A, int[][] B) {
        int[][] res=new int[A.length][B[0].length];
        int i, j, k;
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A.length; j++) {
                res[i][j] = 0;
                for (k = 0; k < A.length; k++)
                    res[i][j] += A[i][k]* B[k][j];
            }
        }
        return res;
    }
}

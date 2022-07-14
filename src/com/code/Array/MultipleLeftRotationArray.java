package com.code.Array;

import java.util.Arrays;

public class MultipleLeftRotationArray {

    public static void main(String[] args) {
       int[] a=new int[]{1, 2, 3, 4, 5};
       int[] b=new int[]{2,3};
       int[][] newArray=solve(a,b);
       for(int i=0;i< newArray.length;i++)
       {
           for(int j=0;j<newArray[0].length;j++)
           {
               System.out.println(newArray[i][j]);
           }
       }
    }
    public static int[][] solve(int[] A, int[] B) {
        int[][] newArray=new int[B.length][];
        for(int i=0;i<B.length;i++)
        {
            B[i]=B[i]%A.length;
            int numberOfTimes=A.length-B[i];
            reverse(A,0,numberOfTimes-1);
            reverse(A,numberOfTimes,A.length-1);
            reverse(A,0,A.length-1);
            for(int j=0;j<newArray.length;j++)
            {
//                 newArray[i][j]=A[B[i]][j];
            }
        }
        return newArray;
    }

    public static int[] reverse(int[] array,int start,int end)
    {
        while(start<end)
        {
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        return array;
    }
}

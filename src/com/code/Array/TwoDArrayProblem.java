package com.code.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoDArrayProblem {

    public static void main(String[] args) {
        //given a matrix which is sorted rowwise as well as columnwise
        //given a traget have to find position of target in given matrix;
        //[[1,2,3]
        // [4,5,7]
        // [7,7,9]]  target=7;
        Scanner sc=new Scanner(System.in);
        //int [] array=new int[2]{-1,-1};
        List<Integer> ls=new ArrayList<Integer>();
        ls.add(0,-1);
        ls.add(1,-1);
        int k=0;
        int numberOfRow=sc.nextInt();
        int numberOfColumn=sc.nextInt();
        for(int i=0;i<numberOfRow;i++)
        {
            for(int j=0;j<numberOfColumn;j++)
            {
//                if(arr[i][j]==target)
//                {
////                    array[k]=i;
////                    k++;
////                    array[k]=j;
//                    ls.set(0,i);
//                    ls.set(1,j);
//
//                }
            }
        }
     //   return lst;
    }

}

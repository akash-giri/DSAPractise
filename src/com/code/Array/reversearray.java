package com.code.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class reversearray {

    public static void main(String[] args) {
        int number=999;
        ArrayList<Integer>integers=new ArrayList<>();
        //15, 20, 20, 15, 10, 30, 45
        //10, 1, 10, 1, 10, 1, 10   ->A=50
        //A : 999
        //B : [ 10, 20, 10, 20, 30, 20, 10 ]
        integers.add(10);
        integers.add(20);
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(20);
        integers.add(10);
        System.out.println(solve(number,integers));
    }
    public static int solve(int A, ArrayList<Integer> B) {
        int difference=A;
        if(A-B.get(0)<=0)
        {
            return 1;
        }
        else{
            int flag=1;
            while(flag>0)
            {
                for(int i=0;i<B.size();i++)
                {
                    difference=difference-B.get(i);
                    if(difference<=0)
                    {
                        difference=i+1;
                        flag=0;
                        break;
                    }
                }
            }
        }
        return difference;
    }
}


/**
 * def solution(arr, target):
 *     if(arr[0]==target):
 *         return 1
 *     for i in range(len(arr)):
 *         target-=arr[i]
 *         if(target<=0):
 *             return i+1
 *     if(target>0):
 *         total=sum(arr)
 *         remainder=target%total
 *         return solution(arr, remainder)
 */


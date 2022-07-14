package com.code.SearchingAndSorting.searching;

public class SquareRoot {

    public static void main(String[] args) {
        int stat=8;
        System.out.println(squareroot(stat));
    }
    static public int squareroot(int x)
    {
        long start=0;
        long end=x;
        while (start<end-1)
        {
            long mid=start+(end-start)/2;
            if(mid*mid<x)
            {
                start=mid;
            }else if(mid*mid==x)
            {
                return (int)mid;
            }else{
                end=mid;
            }
        }
        if(end*end==x)
        {
            return (int)end;
        }else{
            return (int)start;
        }
    }
}

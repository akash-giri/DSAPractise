package com.code.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int noOfDisk=3;
        TOH(noOfDisk,10,11,12);
    }

    static void TOH(int noOfDisk,int tower1,int tower2,int tower3)
    {
        if(noOfDisk==0)
        {
            return;
        }
        TOH(noOfDisk-1,tower1,tower3,tower2);
        System.out.println(noOfDisk+" [" + tower1+"->"+tower2);
        TOH(noOfDisk-1,tower3,tower2,tower1);
    }
}

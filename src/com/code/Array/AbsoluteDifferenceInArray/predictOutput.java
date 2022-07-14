package com.code.Array.AbsoluteDifferenceInArray;

public class predictOutput {

    public static void main(String[] args) {
        int a[]={2};
        a=new int[]{5};
        int x=a[0];
        while(x>=0)
        {
            process(a);
            x=a[0];
            x--;
            System.out.println(x+" ");

        }
    }
    private static void process(int[] a)
    {
        int x=a[0]--;
        x++;
    }
}

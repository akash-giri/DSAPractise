package com.code.Array;

import java.util.Scanner;

public class NegativeNumbersPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            if(array[i]<0)
            {
                System.out.print(array[i]+" ");
            }
        }
    }
}

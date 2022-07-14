package com.code.Array;

import java.util.Scanner;

public class SquareRootOfNumber {

    public static void main(String[] args) {
        //9--->3

        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(squareRoot(number));
    }
    static int squareRoot(int number)
    {
        /**
         *
         *  number=(i=0-number/2)^2;
         *  for(int i=0;i<number/2;i++)
         *  i*i==number; return i;
         *  i*i<number;
         *  i++
         *  i*i>number;
         *  return i-1;
         *
         */
        //224  0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15-225 -196
        if(number==1)
        {
            return 1;
        }
        for(int i=0;i<number;i++)
        {
            if(i*i==number)
            {
                return i;
            }else if(i*i<number)
            {
                continue;
            }
            else{
                return i-1;
            }
        }
        return 0;
    }
}

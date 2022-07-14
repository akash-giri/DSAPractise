package com.code.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class PickFromBothSide {
    public static void main(String[] args) {
      int[] A=new int[]{-969, -948, 350, 150, -59, 724, 966, 430, 107, -809, -993, 337, 457, -713, 753, -617, -55, -91, -791, 758, -779, -412, -578, -54, 506, 30, -587, 168, -100, -409, -238, 655, 410, -641, 624, -463, 548, -517, 595, -959, 602, -650, -709, -164, 374, 20, -404, -979, 348, 199, 668, -516, -719, -266, -947, 999, -582, 938, -100, 788, -873, -533, 728, -107, -352, -517, 807, -579, -690, -383, -187, 514, -691, 616, -65, 451, -400, 249, -481, 556, -202, -697, -776, 8, 844, -391, -11, -298, 195, -515, 93, -657, -477, 587 };
      int b=81;
        System.out.println(solve(A,b));
    }
    public static int solve(int[] A, int B)
    {
        int max=Integer.MIN_VALUE;

        int[] left=new int[A.length];
        Arrays.fill(left,0);

            int k=0;
            for(int i=B;i>0;i--)
            {
                int[] subArray = Arrays.copyOfRange(A, 0, i);
                int sum=0;
                for(int j=0;j<subArray.length;j++)
                {
                    sum+=subArray[j];
                }
                left[k++]=sum;
            }




        return max;
    }
}

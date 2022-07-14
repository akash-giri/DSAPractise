package com.code.StackAndQueue;

import java.util.Stack;

public class FinalPriceDIscount {

    public static void main(String[] args) {
        int[] prices=new int[]{8,4,6,2,3};
        int[] newArray=finalPrices2(prices);
        for(int i=0;i< newArray.length;i++)
        {
            System.out.print(newArray[i]+" ");
        }
    }
    public static int[] finalPrices(int[] A) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty() && A[stack.peek()] >= A[i]) {
//                System.out.println(A[stack.peek()]);
//                System.out.println(A[stack.pop()]);
                A[stack.pop()] -= A[i];
            }
            stack.push(i);
        }
        return A;
    }

    public static int[] finalPrices2(int[] ps)
    {
        int n = ps.length, res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && ps[i] < st.peek())
                st.pop();
            res[i] = ps[i] - (st.isEmpty() ? 0 : st.peek());
            st.push(ps[i]);
        }
        return res;
    }
    /**
     * without Stack
     *
     */
    public static int[] finalPrices3WithoutStack(int[] prices)
    {
         int min=0;
         for(int i=0;i<prices.length-1;i++)
         {
             for(int j=i+1;j<prices.length;j++)
             {
                 if(prices[j]<=prices[i])
                 {
                     prices[i]=prices[i]-prices[j];
                     min=prices[j];
                     break;
                 }
                 else if(prices[i]==min){
                     continue;
                 }
             }
         }
         return prices;
    }
}

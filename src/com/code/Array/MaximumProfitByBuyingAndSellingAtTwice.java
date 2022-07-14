package com.code.Array;

public class MaximumProfitByBuyingAndSellingAtTwice {

    /**
     * Time complexity O(n) and space O(1)
     * @param arr
     * @param n
     * @return
     */

    static int buyingAndSellingShare(int arr[],int n){
        int profit=0;
        for(int i=1;i< n;i++){
            int sub=arr[i]-arr[i-1];
            if(sub>0){
                profit+=sub;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int price[] = { 2, 30, 15, 10, 8, 25, 80 };
        int n= price.length;
        buyingAndSellingShare(price,n);
    }

}

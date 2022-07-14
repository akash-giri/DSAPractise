package com.code.Array;

import java.text.DecimalFormat;

public class CalculateAmountPaidInTaxex {

    public static void main(String[] args) {
         int[][] amount={{3,50},{7,10},{12,25}};
         int income=10;
        System.out.println(convert(amount,income));
    }
    static double amountPaid(int[][] amount,int income)
    {
        double sum=0;
        if(income==0)
        {
            return sum;
        }
        if(income>amount[0][0])
        {
            sum+=amount[0][0]*(double)amount[0][1]/100;
        }
        int ans=amount[0][0];
        for(int i=1;i<amount.length;i++)
        {
            int nextDollarEarned=amount[i][0]-amount[i-1][0];
            ans+=nextDollarEarned;
            if((income-ans)>0)
            {
                sum+=nextDollarEarned*(double)amount[i][1]/100;
            }else{
                ans-=nextDollarEarned;
                int reaminingIncome=income-ans;
                sum+= reaminingIncome*(double)amount[i][1]/100;
            }
        }

        return sum;
    }

    static double convert(int [][] brackets,int income)
    {
        if(income==0){
            return 0;
        }
        double total = 0;
        int u0 = brackets[0][0];
        int per0 = brackets[0][1];
        if(u0<=income){
            total = total + u0*(double)per0/100;
        }else{
            return (income)*(double)per0/100;
        }
        for(int i=1; i<brackets.length; ++i){
            int u = brackets[i][0];
            int p = brackets[i][1];
            if(u<=income){
                total = total + (u-brackets[i-1][0])*(double)p/100;
            }else{
                total = total + (income-brackets[i-1][0])*(double)p/100;
                break;
            }
        }
//        System.out.println(total);
        return total;
    }
}

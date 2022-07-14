package com.code.Array;

public class LittlePhonyandMobilePhones {

    /**
     * Little pony is going to buy some mobile phones for his friends.
     * As there many models available in the market at different prices,
     * He is confused and wants to know the maximum distinct models of a mobile phone he can buy for
     * his friends, given that he has a total X amount of money.
     *
     * You are given an array A of size N. denoting the size of prices of different models.
     * The array is sorted based on prices in increasing order. You are given another array B of size Q
     * denoting the queries. In i'th query, you need to tell the maximum distinct models of mobile phones
     * he can buy with B[i] money.
     * A[3,4,4,6]
     * B[20,4,10,2]
     * o/p- [4,1,2,0]
     *
     */

    public static void main(String[] args) {
        int A[]={3,4,4,6};
        int B[]={20,4,10,2};
      // maximuPurchase(A,B);
        int[] a=solve(A,B);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    static int[] solve(int []A,int []B)
    {
        int prefixsum=0;
        for(int i=0;i<A.length;i++)
        {
            prefixsum+=A[i];
            A[i]=prefixsum;
        }
        for(int i=0;i<B.length;i++)
        {
            int mid=0;
            int start=0;
            int flag=0;
            int end=A.length-1;
            while(start<=end)
            {
                mid=(start+end)/2;
                if(A[mid]==B[i])
                {
                    flag=1;
                    break;
                }
                if(A[mid]>B[i])
                {
                    flag=1;
                    end = mid - 1;
                }
                else if(A[mid]<=B[i])
               {
                   flag=1;
                start=mid+1;
                //count=mid+1;
               }
            }
            if(flag==1)
              B[i]=mid+1;
            else
                B[i]=0;
        }
        return B;
    }




    static void maximuPurchase(int []A,int[]B)
    {
        for(int i=0;i<B.length;i++)
        {
            int amount=B[i];
            int distinct=0;
            for(int j=0;j<A.length;j++)
            {
                if(amount==A[i])
                {
                    distinct++;
                    break;
                }else if(amount<A[i])
                {
                    distinct=distinct+0;
                    break;
                }
                else {
                    distinct++;
                    amount=amount-A[i];
                }
            }
            //c[i]=distinct;
            System.out.print(distinct+" ");
        }
        //System.out.println(c);
    }
}

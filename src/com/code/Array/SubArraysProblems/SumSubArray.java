package com.code.Array.SubArraysProblems;



public class SumSubArray {

    public static void main(String[] args) {
       // int[] A=new int[]{15, 7, 11, 7, 9, 8, 18, 1, 16, 18, 6, 1, 1, 4, 18};
//        int[] A=new int[]{3, 7, 90, 20, 10, 50, 40};
       // int[] A=new int[]{3, 7, 5, 20, -10, 0, 12};
        int[] A=new int[]{20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11};
        int B=9;
       // System.out.println(solveArray(A,B));
        subArrayOfKSize(A,B);
//        int[] result=prefixSum(A);
//        int sum=0;9
//        for(int i=0;i<A.length;i++)
//        {
//            sum=sum+result[i];
//        }
//        System.out.println(sum);
//         long sum=0;
//         for(int s=0;s<A.length;s++)
//         {
//             for(int e=s;e<A.length;e++)
//             {
//                 sum=sum+subArray(A,s,e);
//             }
//         }
//        System.out.println(sum);
    }

    public static int[] prefixSum(int[] array){
        int[] prefix=new int[array.length];
        int k=0;
        for(int i=0;i< array.length;i++)
        {
            long sum=0;
            long temp=0;
            for(int j=i;j<array.length;j++)
            {
                temp=temp+sum;
                sum+=array[j];

            }
            temp+=sum;
            prefix[k++]= (int) temp;
        }
        return prefix;
    }
    static public long subArray(int[] array,int s,int e)
    {
        long sum=0;
        for(int i=s;i<=e;i++)
        {
            sum=sum+array[i];
        }
        return sum;
    }

    public static int solveArray(int[] A, int B) {

        int k=0;
        int[] b=new int[A.length-B+1];
        int min=0;

        for(int i=0;i<=A.length-B;i++)
        {
            int sum=A[i];
            for(int j=i+1;j<(B+i);j++)
            {
                sum+=A[j];

            }
            min=sum/B;
            b[k++]=min;

        }
        int index = 0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<b.length;i++)
        {
            if(res>=b[i])
            {
                res=b[i];
                index=i;
            }
        }
        return (index);
    }
    static void printAllSubArray(int[] array,int s,int e)
    {
        for(int i=s;i<=e;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
    }
    static void subArrayOfKSize(int[] array,int K)
    {
        int s=0;
        int index=0;
        long Max=Integer.MAX_VALUE;
//        System.out.println(array[array.length-K]);
        while(s<=(array.length-K))
        {
            int end=s+(K-1);
//            printAllSubArray(array,s,end);

            System.out.println(subArray(array,s,end)/K);
            long result=subArray(array,s,end)/K;
            if(Max>result)
            {
                Max=result;
                index=s;
            }
            s++;
        }
        System.out.println(index);
    }

}

package com.code.Array;

import java.util.HashMap;
import java.util.Map;


public class DistincNumberInWindow {

    public static void main(String[] args) {
        int[] A={1, 2, 1, 3, 4, 3};  //1-2,2-1,3-2,4-1
        int B=3;
//        int[] A={80, 18, 80, 80, 80, 80, 80, 80, 94, 18 };
//        int B=8;
//        int[] A={2 ,7, 7, 81, 81};
//        int B=1;
        int[] result=distinct(A,B);
        for(int i=0;i< result.length;i++)
        {
            System.out.print(result[i]+" ");  //2,3,3,2
        }
    }
    static int[] distinct(int[] A,int B)
    {
         int[] result=new int[A.length-B+1];
        HashMap<Integer,Integer> res=new HashMap<>();
        int k=0;
        for(int i=0;i<B;i++)
        {
            if(res.containsKey(A[i]))
                res.put(A[i],res.get(A[i])+1);
            else{
                res.put(A[i],1);
            }
        }
        result[k]=res.size();

        for(int i=B;i<A.length;i++)
        {
            if(res.containsKey(A[i]))
                res.put(A[i],res.get(A[i])+1);
            else
                res.put(A[i],1);
            res.replace(A[i-B],res.get(A[i-B])-1);
            if(res.get(A[i-B])==0)
                res.remove(A[i-B]);
            result[++k]=res.size();
        }
        return result;
    }
}

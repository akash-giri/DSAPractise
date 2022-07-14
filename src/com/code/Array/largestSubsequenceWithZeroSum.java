package com.code.Array;

import java.util.HashMap;
import java.util.Map;

public class largestSubsequenceWithZeroSum {
    public static void main(String[] args) {
        int[] newArray=new int[]{1,2,-2,4,-4};
        int[] array=largestSubsequenceArraywithZeroSum(newArray);
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i]);
        }
    }

    //return the length of the largest subsequence with zero sum;
    static int largestSumWithZeroSum(int[] array)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maximum=0;
        int sum=0;
        for(int i=0;i< array.length;i++)
        {
            sum+=array[i];
            if(sum==0)
            {
                maximum=i+1;
            }else if(map.get(sum)!=null)
            {
                maximum=Math.max(maximum,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return maximum;
    }

    /**
     * return the array of largestSubsqeuence with zero sum
     * @param A
     * @return
     */
    static int[] largestSubsequenceArraywithZeroSum(int[] A)
    {
        int sum=0,max=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int start = -1,end = -1;
        for(int i=0;i<A.length;i++){
            sum += A[i];
            if(map.containsKey(sum)){
                if(max < (i-map.get(sum))){
                    max = i-map.get(sum);
                    start = map.get(sum)+1;
                    end = i;
                }
            }
            else
                map.put(sum,i);
        }
        int l=0;
        int[] res = new int[0];
        if(start != -1 && end!= -1){
            res = new int[end-start+1];
            for(int i=start;i<=end;i++)
                res[l++] = A[i];
        }
        return res;

    }
}

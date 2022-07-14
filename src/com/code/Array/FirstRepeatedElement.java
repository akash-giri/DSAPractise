package com.code.Array;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedElement {

    public static void main(String[] args) {
        int[] array=new int[]{-1, -17, -12, 8 ,16, -17, -13 ,-14 ,-3, -6 ,-5 ,-11, -10, -12, -5, 19 ,-17, -5 ,-1, 12};
        int n=array.length;
        System.out.println(firstNonRepeating(array,n));
//        System.out.println(firstRepeated(array,n));
    }
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int counter=0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>1)
            {
                break;
            }
            ++counter;
        }
        if(counter==0)
            return -1;
        else
            return counter+1;
    }

    public static int firstNonRepeating(int arr[], int n)
    {
        // Complete the function
        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer>entry: map.entrySet())
        {
            if(entry.getValue()==1)
            {
                return entry.getKey();
            }
        }
        return 0;
    }
}

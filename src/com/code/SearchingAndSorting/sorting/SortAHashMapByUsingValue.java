package com.code.SearchingAndSorting.sorting;

import java.util.*;

public class SortAHashMapByUsingValue {
    public static void main(String[] args) {
        int[][]A=new int[][]{
                {1, 5},
                {1, 7},
                {1, 5},
                {1, 7},
                {1, 4},
                {1, 5},
                {2, 0},
                {2, 0},
                {2, 0},
                {2, 0}
        };
        solve(A);
    }

    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list = new LinkedList<>(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public static int[] solve(int[][] A) {
        Stack<Integer>stack=new Stack<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        int[] ans=new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            if(map.containsKey(A[i][1]))
            {
                map.put(A[i][1],map.get(A[i][1])+1);
            }else{
                if(A[i][1]==0)
                {
                    continue;
                }else {
                    map.put(A[i][1], 1);
                }
            }
        }
        Map<Integer,Integer>anotherMap=sortByValue(map);
        for(Map.Entry<Integer,Integer>ent:anotherMap.entrySet())
        {
            System.out.println(ent.getKey()+"->"+ent.getValue());
        }

        for(int i=0;i<A.length;i++)
        {
            if(A[i][0]==1)
            {
                stack.push(A[i][1]);
                ans[i]=-1;
            }
            else if(A[i][0]==2)
            {


            }
        }
        return ans;
    }
}

package com.code.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UnionAndIntersectionOfArray {
    /**
     * Time complexity -O(m+n)
     * @param a
     * @param n
     * @param b
     * @param m
     */
    public void printUnion1(int []a,int n,int[] b,int m)
    {
        int i=0;int j=0;
        while(i<n&&j<m)
        {
            if(a[i]<b[j])
            {
                System.out.println(a[i++]);
            }
            else if(b[j]<a[i])
            {
                System.out.println(b[j++]);
            }
            else{
                System.out.println(b[j++]);
                i++;
            }
        }
        while(i<n)
        {
            System.out.println(a[i++]);
        }
        while (j<m)
        {
            System.out.println(b[j++]);
        }
    }
    public void printUnion(int[] a, int n,int[] b, int m)
    {
        //time complexity is O(n+m)
        Map<Integer,Integer> mp = new HashMap<>();
        // Inserting array elements in mp
        for(int i = 0; i < n; i++)
        {
            mp.put(a[i], i);
        }
        for(int i = 0; i < m; i++)
        {
            mp.put(b[i], i);
        }

        System.out.println("The union set of both arrays is :");
        for(Map.Entry mapElement : mp.entrySet())
        {
            System.out.print(mapElement.getKey() + " ");

            // mp will contain only distinct
            // elements from array a and b
        }
    }

    /**
     * time complexity -O(m+n)
     * @param a
     * @param n
     * @param b
     * @param m
     */

    public void intersection1(int []a,int n,int [] b,int m)
    {
        int i=0;int j=0;
        while(i<n&&j<m)
        {
            if(a[i]<b[j])
            {
                i++;
            }
            else if(b[j]<a[i])
            {
                j++;
            }
            else{
                System.out.println(b[j++]);
                i++;
            }
        }
    }

    //Time complexity O(n) and Space O(n)
    public void intersection(int[] nums1, int[] nums2) {


        //ar={1,3,4,5,7}
        //ar1={2,5,8,9}
        Set<Integer> nums1Set= new HashSet<Integer>();
        for(int val:nums1){
            nums1Set.add(val);
        }

        Set<Integer>interSectSet=new HashSet<Integer>();
        for(int val:nums2){
            if(nums1Set.contains(val)){
                interSectSet.add(val);
            }
        }
        int[] interSectVals=new int[interSectSet.size()];
        int index=0;
        for(int val:interSectSet)
            interSectVals[index++]=val;

        for(int val:interSectVals){
            System.out.println(val);
        }
       // return interSectVals;

    }
}

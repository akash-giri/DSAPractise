package com.code.Array;

import java.util.HashSet;
import java.util.Set;

public class ArraySubSetOfAnotherArray {

    /**
     * time complexity O(n) and space O(n)
     */
    public String isSubset( long a1[], long a2[], long n, long m) {
        Set<Integer> s=new HashSet<>();
        int count=0;
        for(int i=0;i<m;i++){
            s.add((int)a2[i]);
        }
        for(int i=0;i<n;i++){
            if(s.contains((int)a1[i])){
                count++;
                if(count==m){
                    return "Yes";
                }
            }
        }
        if(count!=m){
            return "No";
        }
        return "Yes";
    }
}

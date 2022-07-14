package com.code.Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CommonElementInThreeSortedArray {

    /**
     * time complexity O(n1 + n2 + n3) and space (1)
     * @param ar1
     * @param ar2
     * @param ar3
     */

    void findCommon(int ar1[], int ar2[], int ar3[]) {
        // Initialize starting indexes for ar1[], ar2[] and ar3[]
        int i = 0, j = 0, k = 0;
        // Iterate through three arrays while all arrays have elements
        while (i < ar1.length && j < ar2.length && k < ar3.length) {
            // If x = y and y = z, print any of them and move ahead
            // in all arrays
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                System.out.print(ar1[i] + " ");
                i++;
                j++;
                k++;
            }
            // x < y
            else if (ar1[i] < ar2[j])
                i++;
                // y < z
            else if (ar2[j] < ar3[k])
                j++;
                // We reach here when x > y and z < y, i.e., z is smallest
            else
                k++;
        }
    }

    /**
     * removing the duplicate and the best approach with the same time complexity O(n1+n2+n3)
     * @param A
     * @param B
     * @param C
     * @param n1
     * @param n2
     * @param n3
     * @return
     */

    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        // code here
        Set<Integer> res=new TreeSet<>();
        ArrayList<Integer>res1=new ArrayList<>();
        int i=0,j=0,k=0;
        while(i<n1 && j<n2 && k<n3){
            if(A[i]==B[j]&&B[j]==C[k]){
                res.add(A[i]);
                i++;
                j++;
                k++;
            }
            else if(A[i]<B[j]){
                i++;
            }
            else if(B[j]<C[k]){
                j++;
            }
            else{
                k++;
            }
        }
        Iterator<Integer> iterator = res.iterator();
        while (iterator.hasNext())
            res1.add(iterator.next());

        return res1;

    }
}

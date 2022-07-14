package com.code.StackAndQueue;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {

    /**
     * Brute force approach
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         int result[] = new int [nums1.length];
         for (int i=0;i<nums1.length;i++){
         int tro = -1;
         for (int j=0;j<nums2.length;j++){
             if (nums1[i]==nums2[j]){
                 int max = max(j,nums2);
                 if (max==nums2[j])tro = -1;
                 else if (max>nums2[j])tro = max;
             }
         }
         result[i] = tro;
     }
     return result;
 }

 static int max(int j,int []nums2){
     int max = nums2[j];
     for (int i=j+1;i<nums2.length;i++){
         if (max<nums2[i]){max = nums2[i];break;}
     }
     return max;
 }
    /**
     * optmized appraoch using stack
     */
    public int[] nextGreaterElementanotherApproach(int[] nums1, int[] nums2) {
    int ngr[] = NGE(nums2);

    HashMap<Integer,Integer> mp = new HashMap<>();
    for(int i=0;i<nums2.length;i++){
        mp.put(nums2[i],ngr[i]);
    }

    int ans[] = new int[nums1.length];

    for(int i=0;i<nums1.length;i++){
        ans[i]=mp.get(nums1[i]);
    }
    return ans;

}
    public int[] NGE(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ar = new int[n];

        for(int i=n-1; i>=0; i--){

            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ar[i] = -1;
            }else{
                ar[i] = st.peek();
            }
            st.push(arr[i]);
        }

        return ar;
    }
}

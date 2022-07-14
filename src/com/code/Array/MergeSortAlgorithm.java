package com.code.Array;

public class MergeSortAlgorithm {

    public void mergeSort(int []arr,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergeSort(arr,left,mid );
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    public void merge(int []arr,int left,int mid,int right){
        int i=left;
        int j=mid+1;
        int k=left;
        int[] b = new int[arr.length];
        while(i<=mid && j<=right){
            if(arr[i]<arr[j]){
                b[k]=arr[i];
                i++;
            }
            else {
                b[k]=arr[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=right){
                b[k]=arr[j];
                k++;
                j++;
            }
        }else {
            while (i<=mid){
                b[k]=arr[i];
                k++;
                i++;
            }
        }
        for(k=left;k<=right;k++){
            arr[k]=b[k];
        }
    }
}

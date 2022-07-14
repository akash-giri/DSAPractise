package com.code.Array;

public class RotateArrayByOneOrMultipleTime {

    public void rotateArrayByOne(int []arr,int n){
        int temp=arr[n-1];
        int i;
        for(i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[i]=temp;
    }
    public void rotateArrayByNTimes(int []arr,int n,int numberOfTimes){
        while(numberOfTimes!=0){
            rotateArrayByOne(arr,n);
            numberOfTimes--;
        }
    }

    /** time complexity of below methods is O(n) and space(1) **/
    public static void rotateArrayByNTimesOptimizedSolution(int []arr,int n,int numberOfTimes){
        // Reverse the last `k` elements
        reverse(arr, n - numberOfTimes, n - 1);

        // Reverse the first `n-k` elements
        reverse(arr, 0, n - numberOfTimes - 1);

        // Reverse the whole array
        reverse(arr, 0, n - 1);
    }
    public static void reverse(int []arr,int low,int high){
        for (int i = low, j = high; i < j; i++, j--) {
            swap(arr, i, j);
        }
    }
    public static void swap(int []arr,int i,int j){
        int data = arr[i];
        arr[i] = arr[j];
        arr[j] = data;
    }

    public static void main(String[] args) {
        int []Array=new int[]{1,2,3,4,5};
        rotateArrayByNTimesOptimizedSolution(Array, Array.length, 1);
    }
}

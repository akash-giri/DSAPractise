package com.code.Array;

public class MaximumAndMinumInNumberInArray {
    /**
     *
      Maximum and minimum of an array using minimum number of comparisons
     *
     * */
    //{1,3,2}
   // Class Pair is used to return two values from getMinMax()
    static class Pair{
        int max;
        int min;
    }
    static Pair getMinMax(int size,int []arr){
        Pair minmax=new Pair();
        if(size==1){
            minmax.min=arr[0];
            minmax.max=arr[0];
            return minmax;
        }
        if(arr[0]>arr[1]){
           minmax.max=arr[0];
           minmax.min=arr[1];
        }else {
            minmax.min=arr[0];
            minmax.max=arr[1];
        }
        for (int i = 2; i < size; i++) {
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }
        return minmax;

    }

    public int minNumber(int size,int []arr){
        //{3,2,4}
        int min = arr[0];
        if(size==1){
           return arr[0];
        }else {
            for(int i=1;i<size;i++){
                if(min>arr[i]) {
                   min=arr[i];
                }
            }
            return min;
        }

    }
    public int maxNumber(int size,int []arr){
        int max = arr[0];
        if(size==1){
            return arr[0];
        }else {
            for(int i=1;i<size;i++){
                if(max<arr[i]) {
                    max=arr[i];
                }
            }
            return max;
        }
    }


}

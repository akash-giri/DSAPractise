package com.code.recursion;

public class MaximumInArray {

    public static void main(String[] args) {
         int[] array={5,4,3,2,19};
         int max=maximumValueInArray(array,0);
        System.out.println(max);
    }
    static int maximumValueInArray(int[] array,int index)
    {
       if(index==array.length-1)
       {
           return array[index];
       }
       int misa=maximumValueInArray(array,index+1);
       if(misa>array[index])
       {
           return misa;
       }else {
           return array[index];
       }

    }

}

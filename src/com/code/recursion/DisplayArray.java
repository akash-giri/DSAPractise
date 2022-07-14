package com.code.recursion;

public class DisplayArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
//        printArray(array,0);
        printArrayInReverseOrder(array, 0);

    }

    public static void printArray(int[] array,int index)
    {
        if(array.length<=index)
        {
            return;
        }
        System.out.println(array[index]);
        printArray(array,index+1);
    }

    public static void printArrayInReverseOrder(int[] array,int index)
    {
        if(index== array.length)
        {
            return;
        }
        printArrayInReverseOrder(array,index+1);
        System.out.println(array[index]);
    }
}

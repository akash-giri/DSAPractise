package com.code.CollectionFramework.anotherTopic;

import java.util.Arrays;

public class LearnArraysClass {

    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        int index= Arrays.binarySearch(numbers,4);
       // System.out.println("the index of element 4 in the array is "+index);

        Integer[] numb={10,2,32,12,15,76,17,48,79};
        Arrays.sort(numb);

      //  Arrays.fill(numbers,12);
        for(int i:numb){
            System.out.print(i+" ");
        }
    }

}

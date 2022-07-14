package com.code.Array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	// write your code here
        int n,n2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        //reading the number of elements from the that we want to enter
        n=sc.nextInt();
        //creates an array in the memory of length 10
        int[] array = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
          //reading array elements from the user
            array[i]=sc.nextInt();
        }
//        System.out.println("Enter the number of elements you want to store in array2");
//        n2=sc.nextInt();
//        int[] array2 = new int[n2];  //this is for only union program
//        //this is taking another array for union of the program
//        System.out.println("Enter the elements of the array2: ");
//        for(int i=0; i<n2; i++)
//        {
//            //reading array elements from the user
//            array2[i]=sc.nextInt();
//        }
        FindDuplicateNumberInArray duplicateNumberInArray=new FindDuplicateNumberInArray();
        duplicateNumberInArray.numberRepeating(array,n);
     //   MinimumNumberOfJumpsToReachEndArray number=new MinimumNumberOfJumpsToReachEndArray();
     //   int count=number.minJumps(array);
     //   System.out.println(count);
        /**
        int numberOfTimes=2;
        RotateArrayByOneOrMultipleTime rotateArrayByOneOrMultipleTime=new RotateArrayByOneOrMultipleTime();
        rotateArrayByOneOrMultipleTime.rotateArrayByNTimes(array,n,numberOfTimes);
         **/
        //----------------------------------------------------------------------------
        /**
         *
        UnionAndIntersectionOfArray unionOfArray=new UnionAndIntersectionOfArray();
        unionOfArray.intersection(array,array2);

         **/

        /**
         * for reverse an array
          //ReverseAnArray reverseAnArray=new ReverseAnArray();
          //reverseAnArray.reverseArray(n,array);

         **/

        /**
         * min and maximum number in array by using minimum number of compare
          MaximumAndMinumInNumberInArray minmax=new MaximumAndMinumInNumberInArray();
          System.out.println(minmax.minNumber(n,array));
          System.out.println(minmax.maxNumber(n,array));
         **/

        /**
         * merge sort algorithm
         */
//        MergeSortAlgorithm mergeSortAlgorithm=new MergeSortAlgorithm();
//        mergeSortAlgorithm.mergeSort(array,0,n-1);



//        System.out.println("Array elements are: ");
//       //  accessing array elements using the for loop
//        for (int i=0; i<n; i++)
//        {
//            System.out.println(array[i]);
//        }
    }

}

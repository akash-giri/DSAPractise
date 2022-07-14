package com.code.Array;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int[] A=new int[]{2,7,11,15};
        int target=9;
        int[] resultArray=twoSum(A,target);
        for(int i=0;i< resultArray.length;i++)
        {
            System.out.print(resultArray[i]+" ");
        }
    }

    public static int[] twoSum(int[] numbers, int targetSum) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i= 0; i < numbers.length; i++) {
            int num=numbers[i];
            int diff = targetSum - num;
            if (map.containsKey(diff)) {
                int index = map.get(diff);
                return new int[]{i, index};
            }
            map.put(numbers[i],i);
        }
        return new int[]{};
    }

//    public static void main(String[] args) {
////        int[] arr=new int[]{4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8};
////        int target=-3;
////        Arrays.sort(arr);
////        System.out.println(Arrays.toString(twoSum(arr,target)));
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        if(primeNumber(num))
//        {
//            System.out.println("Yes");
//        }
//        else
//        {
//            System.out.println("No");
//        }
//
//
//    }

    public static boolean primeNumber(int number)
    {
        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }
        return true;
    }
}

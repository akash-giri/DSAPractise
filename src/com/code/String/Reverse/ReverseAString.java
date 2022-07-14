package com.code.String.Reverse;

public class ReverseAString {

    public static void main(String[] args)
    {
        String input = "Gesek For Geekss";


        char[] temparray = input.toCharArray();
        int left, right = 0;
        right = temparray.length - 1;

        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right] = temp;
        }

        for (char c : temparray)
            System.out.print(c);
        System.out.println();
    }
}

package com.code.String;

import java.util.HashMap;

public class RomanNumberToInteger {

    public static void main(String[] args) {
        System.out.println(romanToDecimal("MMMDCCXCIV"));
    }
    public static int romanToDecimal(String str) {

        int sum=0;
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int n = str.length();

        for(int i = 0; i < n; i++)
        {
            if (i != n - 1 && map.get(str.charAt(i)) <  map.get(str.charAt(i + 1)))
            {
                sum += map.get(str.charAt(i + 1)) -map.get(str.charAt(i));
                i++;
            }
            else
            {
                sum += map.get(str.charAt(i));
            }
        }
        return sum;
    }
}

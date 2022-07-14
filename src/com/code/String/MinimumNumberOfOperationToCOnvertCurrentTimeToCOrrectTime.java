package com.code.String;

public class MinimumNumberOfOperationToCOnvertCurrentTimeToCOrrectTime {

    public static void main(String[] args) {
        String current ="00:00";
        String Correct="23:59";
        System.out.println(convertTime(current,Correct));
    }

    public static int convertTime(String current, String correct) {
        int res = 0;
        int h = Integer.valueOf(correct.substring(0, 2)) - Integer.valueOf(current.substring(0, 2));
        int m = Integer.valueOf(correct.substring(3)) - Integer.valueOf(current.substring(3));
        if (m < 0) {
            m += 60;
            h--;
        }
        res += h;
        res += m / 15;
        m %= 15;
        res += m / 5 + m % 5;
        return res;
    }
}

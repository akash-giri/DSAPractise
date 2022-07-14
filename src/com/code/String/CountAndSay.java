package com.code.String;

public class CountAndSay {
    public static String countAndSay(int n) {
        String res = "";

        for(int i = 1; i <= n; i++) {
            res = getCountAndSay(res);
        }

        return res;
    }

    public static String getCountAndSay(String s) {
        StringBuilder resBu = new StringBuilder();

        if(s.length() == 0) {
            return "1";
        }

        char tempChar = ' ';
        int tempCnt = 0;
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++) {
            char a = arr[i];
            if(i == 0) {
                tempChar = a;
                tempCnt = 1;
                continue;
            }

            if(tempChar != a) {
                resBu.append(tempCnt);
                resBu.append(tempChar);
                tempChar = a;
                tempCnt = 1;
            }else {
                tempCnt++;
            }
        }

        if(tempCnt >= 1) {
            resBu.append(tempCnt);
            resBu.append(tempChar);
        }

        return resBu.toString();
    }

    public static void main(String[] args) {
        String s=countAndSay(5);
        System.out.println(s);
    }
}

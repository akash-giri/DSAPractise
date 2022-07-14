package com.code.String;

public class PalindromeSubstring {

    public static void main(String[] args) {
        String str="abc";
        System.out.println(countSubstrings(str));
    }

    public static int countSubstrings(String str) {
        String temp = "";
        StringBuffer stf;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {

                temp = str.substring(i, j);

                if (temp.length() >= 2) {
                    stf = new StringBuffer(temp);
                    stf.reverse();
                    if (stf.toString().compareTo(temp) == 0)
                        count++;
                }
            }
        }
        count=count+str.length();
        return count;
    }
}

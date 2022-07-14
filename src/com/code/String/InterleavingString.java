package com.code.String;

public class InterleavingString {

    public static void main(String[] args) {
        String s1="aabcc";
        String s2="dbbca";
        String s3="aadbbcbcac";
        System.out.println(isInterleave(s1,s2,s3));
    }

    public static boolean isInterleave(String s1, String s2, String s3) {
        int counter=0;
        int counter1=0;
        for(int i=0;i<s3.length();i++)
        {
            if(s3.charAt(i)==s1.charAt(i-counter1) && (i-counter1)<=s1.length())
                counter++;
            else if(s3.charAt(i)==s2.charAt(i-counter) && (i-counter)<=s2.length())
                counter1++;
        }
        if(counter+counter1==s3.length())
          return true;
        return false;
    }
}


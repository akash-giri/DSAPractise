package com.code.String;

public class longestCommonPrefix {

    public static void main(String[] args) {
        String[] a={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(a));
    }

    public static String longestCommonPrefix(String[] A) {
        String small=A[0];
        for(int i=1;i<A.length;i++)
        {
            String word=A[i];
            if(small.length()>word.length())
            {
                small=word;
            }
        }
        for(int i=0;i<small.length();i++)
        {
            for(int j=0;j<A.length;j++)
            {
                String word = A[j];
                if(small.charAt(i)!=word.charAt(i))
                {
                    if(i==0)
                        return "";
                    return small.substring(0, i);
                }
            }
        }
        return small;
    }
}

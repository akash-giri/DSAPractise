package com.code.String;

public class FisrtOccurenceWord {
    public static void main(String[] args) {
        String s="cowp";
        String s1="w";
        System.out.println(solve(s,s1));
    }
    public static int solve(String A, String B) {
        int index=0;
        int j=0;
        for(int i=0;i<A.length();i++)
        {
            char sub=B.charAt(j);
            char sub2=A.charAt(i);
            if(sub==sub2)
            {
                if(j!=B.length()-1) {
                    index = i;
                    index = Math.min(index, i);
                    j++;
                }
            }else{
                j=0;
            }
        }
        if(j==0)
        {
            return -1;
        }
        else{
            return index;
        }
    }
}

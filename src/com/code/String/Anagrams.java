package com.code.String;

import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="cbaebabacd";
        String s1="abc";
        int count=0;
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            char ss=s1.charAt(i);
            if(s.charAt(i)==ss)
            {
                count++;
            }
            else{
                count--;
            }
        }
    }

}

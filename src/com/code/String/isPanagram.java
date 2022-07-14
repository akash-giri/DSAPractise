package com.code.String;

public class isPanagram {
    public static void main(String[] args) {
        String s="leetcode";
        if(checkIfPangram(s))
        {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    public static boolean checkIfPangram(String sentence) {

        Boolean[] map=new Boolean[26];
        int index=0;
        for(int i=0;i<26;i++)
        {
            map[i]=false;
        }
        for(int i=0;i<sentence.length();i++)
        {
            if('a'<=sentence.charAt(i)&&sentence.charAt(i)<='z')
            {
                index=sentence.charAt(i)-'a';
            }
            else{
                continue;
            }
            map[index]=true;
        }
        for(int i=0;i<=25;i++)
        {
           // System.out.println(map[i]);
            if(!map[i])
                return false;
        }
        return true;
    }
}

package com.code.String;

public class lengthOfLastword {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a "));
    }

    public static int lengthOfLastWord(String s) {

        int length=s.length()-1;
        int count=0;
        if(s.length()<=1)
        {
            return 1;
        }
        while(length>=0)
        {
            if(s.charAt(length)!=' ')
            {
                count++;
            }
            length--;
        }
        return count;
    }
}

package com.code.String;

public class BoBOccurenceInString {
    public static void main(String[] args) {
        String s="bobob";
        System.out.println(occurence(s));
    }

    static int occurence(String A)
    {
        int count=0;
        for(int i=0;i<A.length()-2;i++)
        {
            String s=A.substring(i,i+2+1);
            if(s.equals("bob"))
            {
                count++;
            }
        }
        return count;
    }
}

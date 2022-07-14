package com.code.String.Reverse;

public class ReversewordsInAGivenString {
    public static void main(String[] args) {
        String s="i.like.this.program.very.much";
        System.out.println(reverseWordInAgivenString(s));
    }

    static String reverseWordInAgivenString(String s)
    {
        String a[] =s.split("[.]");
        int n=a.length;
        StringBuilder ans1=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            ans1.append(a[n - 1 - i]);
            if(i<n-1)
            {
                ans1.append(" ");
            }
        }
        return ans1.toString();
    }

    static String reverseWordInAgivenString1(String s)
    {
        String a[] =s.trim().split("\\s+");
        int n=a.length;
        StringBuilder ans1=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            ans1.append(a[n - 1 - i]);
            if(i<n-1)
            {
                ans1.append(" ");
            }
        }
        return ans1.toString();
    }
}


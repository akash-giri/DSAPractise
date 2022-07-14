package com.code.String;

public class validPalindrome {

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isValidPalindrome(s));
    }
    static boolean isValidPalindrome(String s)
    {
        s=s.replaceAll("[^a-zA-Z]", "");
        s=s.toLowerCase();
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}

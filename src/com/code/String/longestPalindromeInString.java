package com.code.String;

public class longestPalindromeInString {

    //"forgeeksskeegfor"
    static String longestPalin(String S){
        int maxLength=1;
        int start=0;
        int low,high;
        int len=S.length();

        for(int i=1;i<len;i++){
            low=i-1;
            high=i;
            while(low>=0&&high<len&&S.charAt(low)==S.charAt(high)){
                if(high-low+1>maxLength){
                    start=low;
                    maxLength=high-low+1;
                }
                --low;
                ++high;
            }

            low=i-1;
            high=i+1;
            while(low>=0&&high<len&&S.charAt(low)==S.charAt(high)){
                if(high-low+1>maxLength){
                    start=low;
                    maxLength=high-low+1;
                }
                --low;
                ++high;
            }
        }
        S=S.substring(start,(start+maxLength));
        return S;
    }
    public static void main(String[] args)
    {

        String str = "aaaabaaa";
        System.out.println("Palindromic string is: " + longestPalin(str));
    }
}

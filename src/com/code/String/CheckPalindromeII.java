package com.code.String;

import java.util.HashMap;
import java.util.Map;

public class CheckPalindromeII {

    public static void main(String[] args) {
        String s="abbaee";
        System.out.println(palindrome(s));
    }
    static int palindrome(String s)
    {
        int count=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue()%2!=0)
            {
                count++;
            }
        }
        if(count>1)
        {
            return 0;
        }else{
            return 1;
        }
    }
}

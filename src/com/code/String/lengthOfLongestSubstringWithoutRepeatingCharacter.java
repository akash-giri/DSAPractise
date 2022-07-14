package com.code.String;

import java.util.HashMap;

public class lengthOfLongestSubstringWithoutRepeatingCharacter {

    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfSubstring(s));
    }
    static int lengthOfSubstring(String s)
    {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}

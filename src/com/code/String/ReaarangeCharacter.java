package com.code.String;

import java.util.HashMap;


public class ReaarangeCharacter {

    public static void main(String[] args) {
//        String str="ilovecodingleetcode";
//        String str2="code";
//        String str="abcba";
//        String str2="abc";
//        String str="abbaccaddaeea";
//        String str2="aaaaa";
//        String str="codecodecodecode";
//        String str2="code";
        String str="aaaaaaaaaaaaaaaaaaaaaaaaaa";
        String str2="aaaaaaaaa";
        System.out.println(rearrangeCharacters(str,str2));
    }

    public static int rearrangeCharacters(String s, String target) {
        int count=0;
        int ans=0;

        if(s.length()<target.length())
        {
            return ans;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for(int i=0;i<target.length();i++)
        {
            if(map.containsKey(target.charAt(i)))
            {
                count++;
                map.put(target.charAt(i),map.get(target.charAt(i))-1);
                if(map.get(target.charAt(i))==0)
                {
                    return ans+1;
                }
            }
            if(count==target.length())
            {
                i=-1;
                count=0;
                ans++;
            }
        }
        return ans;
    }

    public static int rearrangeCHaracters(String s,String target)
    {
        int[] freq = new int[26];
        int[] freq2 = new int[26];
        for(char ch : s.toCharArray())
            freq[ch-'a']++;
        for(char ch : target.toCharArray())
            freq2[ch-'a']++;

        int min = Integer.MAX_VALUE;
        for(char ch : target.toCharArray())
            min = Math.min(min,freq[ch-'a']/freq2[ch-'a']);

        return min;
    }
}

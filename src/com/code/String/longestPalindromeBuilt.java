package com.code.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class longestPalindromeBuilt {

    public static void main(String[] args) {
//       String str="abccccdd";
//        String str="a";
//        String str="bb";
        String str="cccdd";
        System.out.println(longestPalindromeBuilt2(str));
    }
    static int longestPalindromeBuilt2(String s)
    {
        if(s==null || s.length()==0)
            return 0;
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            }else{
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty())
            return count*2+1;
        return count*2;
    }
    static int longestPalindromeBuilt(String str)
    {
        int count=0;
        int anotherCount=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet())
        {
            if(entry.getValue()%2==0)
            {
                count=count+entry.getValue();
            }else if(map.size()==1){
                return entry.getValue();
            }else{
                anotherCount++;
            }
        }
        if(anotherCount>=1)
        {
            return count+1;
        }
        else {
            return count;
        }
    }
}

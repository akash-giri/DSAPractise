package com.code.StackAndQueue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
//        String str="cbacdcbc";
//        System.out.println(removeDuplicateLetters(str));

        for(int i=1;i<1001;i++)
        {
            System.out.print(i+",");
        }
    }

    public static String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character, Integer> map = new HashMap<>();
        boolean exist[]=new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }


        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
            char ch=s.charAt(i);
            if(exist[ch-'a'])
                continue;
            while (st.size() > 0 && (char) st.peek() > s.charAt(i) && map.get((char) st.peek()) > 0) {
                char rem=st.pop();
                exist[rem-'a']=false;
            }
            st.push(s.charAt(i));
            exist[ch-'a']=true;
        }
        char ans[] = new char[st.size()];
        int i = ans.length-1;
        while (i >= 0) {
            ans[i--] = st.pop();
        }
        return new String(ans);
    }
}

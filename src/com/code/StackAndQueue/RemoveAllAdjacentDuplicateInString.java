package com.code.StackAndQueue;

import java.util.Stack;

public class RemoveAllAdjacentDuplicateInString {

    public static void main(String[] args) {
       String str="abbaca";
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && ch==stack.peek()){
                stack.pop();
                continue;
            }
            stack.push(ch);
        }
        StringBuilder string = new StringBuilder();
        while(!stack.isEmpty()){
            string.append(stack.pop());
        }
        return string.reverse().toString();
    }
    /**
     * time cmplexity O(n) and space complexity O(n)
     */
    public static String removeDuplicateWithoutReverse(String s)
    {
        int len=s.length();
        if(len<=1)
            return s;
        Stack<Character> st = new Stack<>();
        for(int i=len-1;i>=0;i--){
            char c = s.charAt(i);
            if(st.isEmpty()||st.peek()!=c)
                st.push(c);
            else
                st.pop();
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty())
            ans.append(st.pop());
        return ans.toString();
    }

    public static String removeDuplicateWithoutUsingStack(String s){
        StringBuilder str=new StringBuilder();
        for (char c : s.toCharArray()) {
            int size = str.length();
            if (size > 0 && str.charAt(size - 1) == c) {
                str.deleteCharAt(size - 1);
            } else {
                str.append(c);
            }
        }
        return str.toString();
    }
}

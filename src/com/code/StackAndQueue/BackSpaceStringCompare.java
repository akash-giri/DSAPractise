package com.code.StackAndQueue;

import java.util.Stack;

public class BackSpaceStringCompare {
    public static void main(String[] args) {
        String s="ab#c";
        String t="ad#c";
        if(backspaceCompare(s,t))
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    /**
     * without stack solution
     * @param s
     * @param t
     * @return
     */
    public static boolean backspaceCompare(String s, String t) {
        return backSpace(s).equals(backSpace(t));
    }
    public static String backSpace(String str)
    {
        char[] charArray=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<charArray.length;i++)
        {
            if(charArray[i]=='#')
            {
                if(sb.length()>0)
                {
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else{
                sb.append(charArray[i]);
            }
        }
        return sb.toString();
    }
    /**
     * with stack solution
     */
    public static String backSpaceStack(String str)
    {
        Stack<Character>ans=new Stack();
        for(char c:str.toCharArray())
        {
            if(c!='#')
            {
                ans.push(c);
            }
            else if(!ans.empty())
            {
                ans.pop();
            }
        }
        return String.valueOf(ans);
    }
}

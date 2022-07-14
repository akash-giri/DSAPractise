package com.code.StackAndQueue;

import java.util.Stack;

public class MakeGoodString {

    public static void main(String[] args) {
        String str="abBAcC";
        System.out.println(makeGood(str));
    }
    public static String makeGood(String s)
    {
        Stack<Character> stk=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(stk.isEmpty())
                stk.push(ch);
            else if(Math.abs((int)stk.peek()-(int)ch)==32)
                stk.pop();
            else
                stk.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:stk)
            sb.append(ch);
        return sb.toString();
    }
}

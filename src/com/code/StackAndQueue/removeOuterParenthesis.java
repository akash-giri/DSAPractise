package com.code.StackAndQueue;

import java.util.Stack;

public class removeOuterParenthesis {

    public static void main(String[] args) {

        String str="(()())(())";
        System.out.println(removeOuterParentheses(str));
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder stb=new StringBuilder();
        Stack<Character> stack= new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(stack.size()>=1){
                    stb.append('(');
                }
                stack.push('(');
            }else{
                if(stack.size()>1){
                    stb.append(')');
                }
                stack.pop();
            }

        }
        return stb.toString();

    }
}

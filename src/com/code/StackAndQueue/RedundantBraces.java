package com.code.StackAndQueue;

import java.util.Stack;

public class RedundantBraces {

    public static void main(String[] args) {
        String str="((a+b))";
        System.out.println(braces(str));
    }

    public static int braces(String A) {
        Stack<Character> st = new Stack<>();
        char[] str = A.toCharArray();

        for (char ch : str) {

            if (ch == ')') {
                char top = st.peek();
                st.pop();

                int flag = 1;

                while (top != '(') {
                    if (top == '+' || top == '-'
                            || top == '*' || top == '/') {
                        flag = 0;
                    }
                    top = st.peek();
                    st.pop();
                }
                if (flag == 1) {
                    return 1;
                }
            } else {
                st.push(ch);
            }
        }
        return 0;
    }
}

package com.code.StackAndQueue;

import java.util.Stack;

public class baseBallGame {

    public static void main(String[] args) {
        String[] s=new String[]{"5","2","C","D","+"};
        System.out.println(calPoints(s));
    }

    public static int calPoints(String[] ops) {
        long sum = 0;
        Stack<String> stack = new Stack<>();
        for (String s : ops) {
            switch (s) {
                case "+":
                    long top = Long.parseLong(stack.peek());
                    long secondTop = Long.parseLong(stack.get(stack.size() - 2));
                    sum += top + secondTop;
                    stack.push(String.valueOf(top + secondTop));
                    break;
                case "D":
                    long newScore = Long.parseLong(stack.peek()) * 2;
                    sum += newScore;
                    stack.push(String.valueOf(newScore));
                    break;
                case "C":
                    long scoreToBeDeleted = Long.parseLong(stack.pop());
                    sum -= scoreToBeDeleted;
                    break;
                default:
                    stack.push(s);
                    sum += Long.parseLong(s);
                    break;
            }
        }
        if (sum <= Integer.MAX_VALUE)
            return (int) sum;
        else {
            return 0;
        }
    }
}

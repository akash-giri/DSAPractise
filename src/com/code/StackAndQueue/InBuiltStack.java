package com.code.StackAndQueue;

import java.util.Stack;

public class InBuiltStack {

    /**
     * time complexity-insert and remove O(1)
     * @param args
     */
    public static void main(String[] args) {
//        Stack<Integer>stack=new Stack<>();
        ImplementStackUsingQueue stack=new ImplementStackUsingQueue();
        stack.push(34);
        stack.push(35);
        stack.push(2);
        stack.push(9);
        stack.push(18);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());

    }
}

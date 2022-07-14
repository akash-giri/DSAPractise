package com.code.StackAndQueue;

public class StackMain {

    public static void main(String[] args) throws CustomStackException {
//        CustomStack stack=new CustomStack(5);
//        DynamicStack stack=new DynamicStack(5);
        ImplementStackUsingQueue stack=new ImplementStackUsingQueue();
        stack.push(34);
        stack.push(35);
        stack.push(2);
        stack.push(9);
        stack.push(18);

        stack.push(89);
        System.out.println(stack.top());
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

//        System.out.println(stack.pop());
    }
}

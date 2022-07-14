package com.code.StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InBuiltQueue {

    public static void main(String[] args) {
//        Queue<Integer> queue=new LinkedList<>();
        ImplementQueueUsingStack queue=new ImplementQueueUsingStack();
        queue.push(3);
        queue.push(6);
        queue.push(5);
        queue.push(19);
        queue.push(1);

        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

//        Deque<Integer> deque=new ArrayDeque<>();
//        deque.add(89);
//        deque.addLast(78);
//        deque.removeFirst();
//        deque.removeLast();

    }
}

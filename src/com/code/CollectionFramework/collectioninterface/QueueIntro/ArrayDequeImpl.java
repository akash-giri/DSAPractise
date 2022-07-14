package com.code.CollectionFramework.collectioninterface.QueueIntro;

import java.util.ArrayDeque;

public class ArrayDequeImpl {
    /**
     * double queue both side we can anter and remove the element
     * @param args
     */
    public static void main(String[] args) {
        ArrayDeque<Integer>adding=new ArrayDeque<>();
        adding.offer(23);
        adding.offerFirst(12);
        adding.offerLast(45);
        adding.offerLast(26);
        System.out.println(adding);

        System.out.println(adding.peek());
        System.out.println(adding.peekFirst());
        System.out.println(adding.peekLast());

        System.out.println(adding.poll());
        System.out.println(adding);

        System.out.println(adding.pollFirst());
        System.out.println(adding);
        System.out.println(adding.pollLast());
        System.out.println(adding);

    }
}

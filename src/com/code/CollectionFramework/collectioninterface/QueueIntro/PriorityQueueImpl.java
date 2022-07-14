package com.code.CollectionFramework.collectioninterface.QueueIntro;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueImpl {

    /**
     * it is also implementing by default min heap
     * and after using Comparator.reverseOrder() in constructor of
     * priorityQueue it is behave like max heap
     * @param args
     */
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

    }



}

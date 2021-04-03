package org.testcollection;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Jue-PC
 */
public class TestQueue {

    private List<Integer> fifo;

    public TestQueue() {
        fifo = new LinkedList<>();
    }

    public void Stack() {
        Queue<Integer> fifo = new LinkedList<>();
        System.out.println(fifo);
        for (int i = 0; i < 10; i++) {
            fifo.offer(i);
            System.out.println(fifo);
        }
        Queue<Integer> newQueue = new LinkedList<>();
        System.out.println(newQueue);
        while (true) {
            if (fifo.size() == 0) {
                break;
            }
            int i = fifo.poll();
            newQueue.offer(i);
            System.out.print(newQueue);
            System.out.println(fifo);

        }
    }

    public static void main(String[] args) {
        TestQueue test = new TestQueue();
        test.Stack();
    }

}
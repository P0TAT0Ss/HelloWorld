package pers.han.TestCollection;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class testQueue {

    private List<Integer> fifo;

    public testQueue() {
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
        testQueue test = new testQueue();
        test.Stack();
    }

}
package src;

import java.util.PriorityQueue;

public class Pqueues {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("a");
        pq.add("b");
        pq.add("c");
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.size());
        pq.clear();
        pq.add("a");
        pq.add("b");
        pq.add("c");
        System.out.println(pq.remove());
        System.out.println(pq);
        pq.clear();
        pq.add("a");
        pq.add("b");
        pq.add("c");
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}

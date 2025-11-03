package Queues;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrioQue {
    // Priority Queue = A data structure that stores elements based on their priority
    //                  Elements with higher priority are served before elements with lower priority
    //                  If two elements have the same priority, they are served according to their order in the queue



    public static void main(String[] args){
        

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder()); //max heap

        queue.offer("B");
        queue.offer("C");
        queue.offer("F");
        queue.offer("A");
        queue.offer("D");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}

package Queues;
import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    
    public static void main(String[] args){



        // Queue = FIFO data structure. First In First Out
        // Elements are added to the end of the queue and removed from the front of the queue

        // enque = offer()
        // deque = poll()
        // peek() = returns the head of the queue without removing it
        // isEmpty() = checks if the queue is empty
        // size() = returns the size of the queue
        Queue<String> queue = new LinkedList<String>();

        System.out.println("Is the queue empty? " + queue.isEmpty());

        queue.offer("Karen"); //adds an element to the end of the queue
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.peek()); //returns the head of the queue without removing it
        queue.poll(); //removes the head of the queue
        System.out.println("Does the queue contain Chad? " + queue.contains("Chad")); //true
        System.out.println(queue.size()); // size is 3 now

        // where are queues used?
        // Keyboard buffer
        // Printer Queue
        // Breadth First Search Algorithm
    }
}

package DataStructures;

import java.util.LinkedList;

/**
 * Created by Kevin on 6/2/2017.
 */
public class Queue {
    LinkedList queueList;

    public Queue() {
        queueList = new LinkedList();
    }

    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    public int size() {
        return queueList.size();
    }

    public void enqueue(int n) {
        queueList.addLast(n);
    }

    public int dequeue() {
        return (int) queueList.remove(0);
    }

    public int peek() {
        return (int) queueList.get(0);
    }

    public int poll() {
        int a = (int) queueList.get(0);
        queueList.remove(0);
        return a;
    }

    //Testing purposes
    public static void main(String[] args) {
        Queue numQueue = new Queue();
        numQueue.enqueue(5);
        numQueue.enqueue(23);
        numQueue.enqueue(15);
        numQueue.enqueue(3);
        numQueue.enqueue(7);
        numQueue.enqueue(8);

        System.out.println("First out: " + numQueue.dequeue());
        System.out.println("Second out: " + numQueue.dequeue());
        System.out.println("Poll: " + numQueue.poll());
        System.out.println("Peek: " + numQueue.peek());
    }

}

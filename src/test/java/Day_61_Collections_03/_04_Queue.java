package Day_61_Collections_03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class _04_Queue {
    public static void main(String[] args) {

        Queue<String> queue=new ArrayBlockingQueue<>(4);
        queue.add("Gulden");
        queue.add("Symbat");
        queue.add("Selim");
        queue.add("Ramazan");
        System.out.println("queue = " + queue);

        String str=queue.remove();
        System.out.println("str = " + str);

        System.out.println("queue.offer(\"Selim\") = " + queue.offer("Selim"));
        System.out.println("queue.offer(\"Ayse\") = " + queue.offer("Ayse"));
        System.out.println("queue = " + queue);

        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue = " + queue);

        System.out.println("queue.element() = " + queue.element());

        System.out.println("queue.peek() = " + queue.peek());



    }
}

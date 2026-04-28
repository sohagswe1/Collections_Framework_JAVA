import java.util.PriorityQueue;
import java.util.Iterator;

public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.offer(30);
        pq.offer(20);

        System.out.println("Initial PriorityQueue: " + pq);

        System.out.println("Head element using peek(): " + pq.peek());

        System.out.println("Removed head using poll(): " + pq.poll());
        System.out.println("Queue after poll(): " + pq);

        pq.remove(30);
        System.out.println("Queue after removing 30: " + pq);

        System.out.println("Does queue contain 20? " + pq.contains(20));

        System.out.println("Current size: " + pq.size());

        System.out.print("Viewing queue using Iterator: ");
        Iterator<Integer> itr = pq.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        Object[] arr = pq.toArray();
        System.out.print("Data from array: ");
        for (Object x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        pq.clear();
        System.out.println("Is queue empty or not? " + pq.isEmpty());
    }
}
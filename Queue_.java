import java.util.*;

public class Queue_ {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.offer(30);

        System.out.println(q);

        System.out.println(q.peek());

        System.out.println(q.poll());

        System.out.println(q);

        System.out.println(q.size());

        System.out.println(q.contains(20));

        System.out.println(q.isEmpty());

        q.clear();

        System.out.println(q);
    }
}
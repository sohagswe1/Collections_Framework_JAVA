import java.util.*;

public class StackMethods {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Pop: " + stack.pop());

        System.out.println("Peek: " + stack.peek());

        System.out.println("Empty: " + stack.empty());

        System.out.println("Search 10: " + stack.search(10));

        System.out.println("Size: " + stack.size());

        System.out.println("Contains 20: " + stack.contains(20));

        System.out.println("Get index 0: " + stack.get(0));

        stack.set(0, 100);

        System.out.println("After set: " + stack);

        stack.add(200);

        System.out.println("After add: " + stack);

        stack.remove(1);

        System.out.println("After remove index 1: " + stack);

        stack.remove(Integer.valueOf(200));

        System.out.println("After remove value 200: " + stack);

        System.out.println("First Element: " + stack.firstElement());

        System.out.println("Last Element: " + stack.lastElement());

        System.out.println("Capacity: " + stack.capacity());

        Iterator<Integer> it = stack.iterator();

        System.out.print("Iterator: ");

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        stack.clear();

        System.out.println("After clear: " + stack);

        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
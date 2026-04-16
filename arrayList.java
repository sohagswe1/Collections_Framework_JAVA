import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
      


        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15);

        System.out.println("After add: " + list);

        System.out.println("Get index 0: " + list.get(0));

        list.set(0, 100);
        System.out.println("After set: " + list);

        list.remove(1);
        list.remove(Integer.valueOf(30));
        System.out.println("After remove: " + list);

        System.out.println("Size: " + list.size());
        System.out.println("Contains 20? " + list.contains(20));
        System.out.println("Is empty? " + list.isEmpty());

        list.addAll(Arrays.asList(5, 6, 7));
        System.out.println("After addAll: " + list);

        System.out.println("Index of 5: " + list.indexOf(5));
        System.out.println("Last index of 5: " + list.lastIndexOf(5));

        Collections.sort(list);
        System.out.println("Sorted ascending: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted descending: " + list);

        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();

        list.forEach(x -> System.out.print(x + " "));
        System.out.println();

        list.removeIf(x -> x % 2 == 0);
        System.out.println("After removeIf: " + list);

        list.addAll(Arrays.asList(8, 9, 10));
        System.out.println("SubList: " + list.subList(0, 2));

        ArrayList<Integer> newList = new ArrayList<>(list);
        System.out.println("Copied list: " + newList);

        Object[] arr = list.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        list.clear();
        System.out.println("After clear: " + list);
    }
}


    

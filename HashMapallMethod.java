import java.util.*;

public class HashMapallMethod {
    public static void main(String[] args) {

        // 1. Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2. put() - add key-value
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        // 3. putIfAbsent()
        map.putIfAbsent(2, "BB"); // won't override
        map.putIfAbsent(4, "D");

        // 4. get()
        System.out.println(map.get(1));

        // 5. getOrDefault()
        System.out.println(map.getOrDefault(5, "Not Found"));

        // 6. containsKey()
        System.out.println(map.containsKey(2));

        // 7. containsValue()
        System.out.println(map.containsValue("C"));

        // 8. size()
        System.out.println(map.size());

        // 9. isEmpty()
        System.out.println(map.isEmpty());

        // 10. remove(key)
        map.remove(3);

        // 11. remove(key, value)
        map.remove(2, "B");

        // 12. replace(key, value)
        map.replace(1, "AA");

        // 13. replace(key, oldValue, newValue)
        map.replace(1, "AA", "AAA");

        // 14. keySet()
        Set<Integer> keys = map.keySet();
        System.out.println(keys);

        // 15. values()
        Collection<String> values = map.values();
        System.out.println(values);

        // 16. entrySet()
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> e : entries) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // 17. forEach()
        map.forEach((k, v) -> System.out.println(k + ":" + v));

        // 18. clear()
        // map.clear();

        // 19. clone()
        HashMap<Integer, String> map2 = (HashMap<Integer, String>) map.clone();

        // 20. putAll()
        HashMap<Integer, String> map3 = new HashMap<>();
        map3.putAll(map);

        // 21. replaceAll()
        map.replaceAll((k, v) -> v + "_updated");

        // 22. compute()
        map.compute(1, (k, v) -> v + "_compute");

        // 23. computeIfAbsent()
        map.computeIfAbsent(5, k -> "E");

        // 24. computeIfPresent()
        map.computeIfPresent(1, (k, v) -> v + "_present");

        // 25. merge()
        map.merge(1, "X", (oldVal, newVal) -> oldVal + newVal);

        // 26. equals()
        System.out.println(map.equals(map2));

        // 27. hashCode()
        System.out.println(map.hashCode());

        // 28. toString()
        System.out.println(map.toString());
    }
}
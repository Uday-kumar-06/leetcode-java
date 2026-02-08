import java.util.*;

public class Main {

    public static void freq(Map<String, Integer> map) {
        List<Map.Entry<String,Integer>> even = new ArrayList<>();
        List<Map.Entry<String,Integer>> odd  = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                even.add(entry);
            } else {
                odd.add(entry);
            }
        }

        // Even frequency → ascending
        even.sort((a, b) -> a.getValue() - b.getValue());

        // Odd frequency → descending
        odd.sort((a, b) -> b.getValue() - a.getValue());

        even.forEach(e -> System.out.println(e.getKey() + " --> " + e.getValue()));
        odd.forEach(e -> System.out.println(e.getKey() + " --> " + e.getValue()));
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 3);
        map.put("B", 2);
        map.put("C", 5);
        map.put("D", 4);
        map.put("E", 1);

        freq(map);
    }
}

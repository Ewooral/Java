package data_structures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DictOrMap {
    public static void main(String[] args) {

        System.out.println("...........................");
        // This takes any Type of data
        Map<Object, Object> map1 = new HashMap<>();
        map1.put("null", false);
        map1.put(2, "Fathers");
        System.out.println(map1);

        Map<String, Integer> map2 = new HashMap<>();

        // Create a hash map
        Map<String, Double> map = new HashMap<>();

        // Put elements to the map
        map.put("Zara", (3434.34));
        map.put("Mahnaz", (123.22));
        map.put("Ayan", (1378.00));
        map.put("Daisy", (99.22));
        map.put("Qadir", (-19.08));

        // Get a set of the entries
        Set<Entry<String, Double>> set = map.entrySet();
        System.out.print("\nThis is a set: ");
        System.out.println(set);
        // Get an iterator
        // Iterator i = set.iterator();

        Iterator<Entry<String, Double>> i = set.iterator();

        // Display elements
        while (i.hasNext()) {
            // Map.Entry me = (Map.Entry) i.next();
            Entry<String, Double> me = i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Deposit 1000 into Zara's account
        double balance = ((Double) map.get("Zara")).doubleValue();
        map.put("Zara", (balance + 1000));
        System.out.println("Zara's new balance: " + map.get("Zara"));

        // Insert key and value into the Dictionary
        map2.put("Jan", 1);
        map2.put("Feb", 2);
        map2.put("Emma", 1);
        System.out.println("...........................");
        System.out.println(map);

        // Access a value using its key
        int v = map2.get("Jan");
        System.out.println("value of key 'Jan': " + v);

        // Object two maps for equality
        System.out.println(map.equals(map2));
    }

}

import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;
import java.util.Map.Entry;

public class _HashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // Create a hashmap
        System.out.println("....CREATE...");
        map.put(0, "Linear");
        map.putAll(Map.of(1, "Arrays", 2, "Queues", 3, "Stacks"));

        Map<Integer, String> mapp = Map.ofEntries(
                entry(1, "a"),
                entry(2, "b"),
                entry(3, "c"),
                entry(26, "z"));

        System.out.println(map);
        System.out.println(mapp);

        // get keys and values
        System.out.println("...GET KEYS AND VALUES...");
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        System.out.println(mapp.keySet());

        for (Entry<Integer, String> k : map.entrySet()) {
            System.out.println(k.getKey() + ": " + k.getValue());
        }
        System.out.println("............................");
        for (Entry<Integer, String> k : mapp.entrySet()) {
            System.out.println(k.getKey() + ": " + k.getValue());
        }
    }

}

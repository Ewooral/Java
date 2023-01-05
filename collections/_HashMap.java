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
        System.out.println("............................");
        _HashMap m = new _HashMap();
        m.countChars("souo");
    }

    HashMap<Character, Integer> hMap = new HashMap<>();

    public void countChars(String ch) {
        for (int i = 0; i < ch.length(); i++) {
            char c1 = ch.charAt(i);
            if (hMap.containsKey(c1)) {
                continue;
            }
            int count = 1;
            hMap.put(c1, count);
            for (int j = i + 1; j < ch.length(); j++) {
                char c2 = ch.charAt(j);
                if (c1 == c2) {
                    hMap.put(c1, count + 1);
                    count = hMap.get(c1);
                }

            }

            System.out.println(c1 + ":" + hMap.get(c1));

        }
    }

}

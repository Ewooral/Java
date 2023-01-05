import java.util.HashMap;

public class Str_CharacterFrequency {
    public static void main(String[] args) {
        testFrequency();

    }

    public static void frequency(String message) {
        int[] arr = new int[message.length()];
        String visited = "";
        for (int i = 0; i < message.length(); i++) {
            String current = message.substring(i, i + 1);
            if (visited.contains(current) || current.equals(" ")) {
                continue;
            }
            int count = 1;
            arr[i] = count;
            for (int j = i + 1; j < message.length(); j++) {
                String next = message.substring(j, j + 1);
                if (current.equals(next)) {
                    arr[i] = count + 1;
                    count = arr[i];
                }
            }
            System.out.print(current + ": ");
            System.out.println(arr[i]);
            visited += current;

        }

    }

    private static HashMap<Character, Integer> hMap = new HashMap<>();

    public static void countChars(String ch) {
        for (int i = 0; i < ch.length(); i++) {
            char c1 = ch.charAt(i);
            if (hMap.containsKey(c1) || c1 == ' ') {
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

    public static void testFrequency() {
        String message = "when was heew ";
        countChars(message);
        System.out.println("............");
        frequency(message);

        // CaesarCipher CC = new CaesarCipher();
        // System.out.println(CC.encrypt(message, 5));
    }

}

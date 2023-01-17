import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Advanced_Java_Techniques {

    public static void main(String[] args) {
        // Advanced looping
        IntStream.range(0, 5).forEach(System.out::println);
        int[] a = new int[] { 1, 2, 4, 8, 3, 0, -1, 3, 90 };
        int[] b = a.clone();

        b[0] = -5;
        b[5] = 100;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        String[] words = { "foo", "bar", "foo", "foo" };
        wordFrequency(words);

    }

    static void wordFrequency(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
    }
}

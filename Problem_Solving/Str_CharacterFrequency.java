
public class Str_CharacterFrequency {
    public static void main(String[] args) {
        testFrequency();

    }

    public static void frequency(String message) {
        int[] arr = new int[30];
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

    public static void testFrequency() {
        String message = "when was heew ";
        frequency(message);

        // CaesarCipher CC = new CaesarCipher();
        // System.out.println(CC.encrypt(message, 5));
    }

}

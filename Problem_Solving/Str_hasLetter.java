public class Str_hasLetter {
    public static void main(String[] args) {
        String str = "God is not dead";
        char ch = 'o';
        System.out.println(hasLetter(str, ch));
        System.out.println(charIndex(str, ch));
    }

    public static boolean hasLetter(String word, char letter) {
        char[] charArr = word.toCharArray();
        for (char c : charArr) {
            if (c == letter) {
                return true;
            }
        }
        return false;
    }

    public static int charIndex(String word, char letter) {
        int i;
        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                return i;
            }
        }

        return -1;
    }
}
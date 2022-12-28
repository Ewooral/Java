public class Str_Replace {
    public static void main(String[] args) {
        System.out.println(replace("a happy", 'a', 'i'));
    }

    public static String replace(String word, char old, char New) {
        char[] cArr = word.toCharArray();
        char[] cArr2 = new char[cArr.length];
        int i = 0;
        for (char c : cArr) {
            if (c == old)
                cArr2[i] = New;
            else
                cArr2[i] = c;
            i++;
        }
        return new String(cArr2);
    }
}

public class RegularExpression {
    public static void main(String[] args) {
        System.out.println(regularExpression("oh no mo do on you ok oh for oh sure oh", "[oh]"));
        // System.out.println(regularExpression("1 2 33", "[1-3]*"));
    }

    public static String[] regularExpression(String word, String token) {
        String[] ch = word.split(token);
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
        return ch;
    }
}

/**
 * + means one or more eg. "it+" means one or more it(s)
 * use parenthesis to do explicit groupings. eg. word.split("i(t+")
 * * means zero or more. eg. word.split("it*");
 * | means OR
 * [] means match anything in the set
 * ^ indicates NOT any characters in this set eg. word.split("[^a-z123]")
 */
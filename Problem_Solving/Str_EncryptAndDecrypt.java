
public class Str_EncryptAndDecrypt {

    public static void main(String[] args) {
        testCode();
    }

    public static void testCode() {

        String test = "Your Password is OWusu123@#-//";
        String test1 = "At noon be in the conference room with " +
                "your hat on for a surprise party. YELL LOUD!";

        // instance object
        CaesarCipher cc = new CaesarCipher(15);

        System.out.println("encrypted: " + cc.encryptStr(test));
        System.out.println("Original: " + test);

        System.out.println("...ENCRYPT...");
        String encrypt = cc.encryptStr(test1);
        System.out.println(encrypt);

        System.out.println("...DECRYPT...");
        System.out.println(cc.decryptStr(encrypt));

    }

}

class CaesarCipher {

    // Fields or Instance variables
    // They can be accessed by every method in the class
    private final String ENCRYPT = "At noon be in the conference room with " +
            "your hat on for a surprise party. YELL LOUD!";
    private String alphabet;
    private String shiftedAlphabet;

    // A constructor
    public CaesarCipher(int key) {
        alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
    }

    // method
    public String encryptStr(String input) {
        StringBuilder encrpyted = new StringBuilder(input.toUpperCase());

        for (int i = 0; i < encrpyted.length(); i++) {
            char currChar = encrpyted.charAt(i);
            int idx = alphabet.indexOf(currChar);
            if (idx != -1) {
                char newChar = shiftedAlphabet.charAt(idx);
                encrpyted.setCharAt(i, newChar);
            }
        }
        return encrpyted.toString();
    }

    // method
    public String decryptStr(String encrypted) {
        String toUpper = ENCRYPT.toUpperCase();
        StringBuilder ss = new StringBuilder();
        for (int k = 0; k < 26; k++) {
            String s = encryptStr(encrypted);
            if (s.equals(toUpper)) {
                ss.append(s);

            } else {
                System.out.println("not found!");
            }
        }
        return toUpper.toString();
    }
}

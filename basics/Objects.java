
public class Objects {

    // instance variable (no static keyword)
    public String type;

    public static void main(String[] args) {
        // creating an instance of the Objects class (Instantiation)
        Objects item = new Objects();
        item.type = "Hat";
        item.displayItem();

        // /* STRING OBJECT
        // A string in Java is not a primitive, but a complex object
        // Literal characters are wrapped in single quotes
        // */
        char[] chars = { 'H', 'e', 'l', 'l', 'o', '!' };
        String s = new String(chars);
        System.out.println(s);

        String s1 = "This is a string!";
        String s2 = new String("This is also a string!");
        System.out.println(s1);
        System.out.println(s2);

        String s3 = "Shirt size: ";
        String s4 = "M,";
        String s5 = s3 + s4 + " Qty: " + 4 + "m";
        System.out.println(s5);

        char[] Greet = { 'H', 'O', 'W', 'A', 'R', 'E', 'Y', 'O', 'U', '?' };
        String greetMe = new String(Greet);
        System.out.println(greetMe);

        char[] Greet2 = greetMe.toCharArray();
        for (char c : Greet2) {
            System.out.println(c);
        }

    }

    // instance method (no static keyword)
    private void displayItem() {
        System.out.println("This is a " + this.type);
    }

}
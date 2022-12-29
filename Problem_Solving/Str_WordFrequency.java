
import java.io.*;
import java.util.HashMap;

/**
 * @param {string} str
 * @return {boolean} true or false
 * @author elijah owusu boahen
 * 
 */

public class Str_WordFrequency {

    // fields or instance variables
    public static String filePath = "Problem_Solving/countWords.txt";
    private int n;
    private int m;

    public static void main(String[] args) {
        testCode();
    }

    // constructor
    public Str_WordFrequency(int n, int m) {
        this.n = n;
        this.m = m;
    }

    // instance method
    public int addNum() {
        return this.n + this.m;
    }

    public static void testCode() {
        Peep p = new Peep(1, 2, 9);
        System.out.println(p.addNum());
        p.countWords();

    }

}

// Class Inheritance
class Peep extends Str_WordFrequency {

    private int w;

    public Peep(int n, int m, int w) {
        super(n, m);
        this.w = w;

    }

    @Override
    public int addNum() {
        return this.w;
    }

    public void countWords() {

        try {
            // write to file
            BufferedWriter wf = new BufferedWriter(new FileWriter(Str_WordFrequency.filePath));
            wf.write("who has the final say? \nI bet you that it is Jesus \nwho has the final say\n" +
                    "has the blokes whom we \nspared been able to init the \nvalues in their final sayings?");
            wf.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

        try {
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            // read from file and convert it to an array of strings
            BufferedReader rf = new BufferedReader(new FileReader(Str_WordFrequency.filePath));
            String line;
            while ((line = rf.readLine()) != null) {
                String[] eachLine = line.split(" ");

                for (String w : eachLine) {
                    w = w.toLowerCase();
                    if (map.keySet().contains(w)) {
                        map.put(w, map.get(w) + 1);
                    } else {
                        map.put(w, 1);
                    }

                }
            }

            for (String w : map.keySet()) {
                int occurences = map.get(w);

                // System.out.println(occurences + "\t" + w);
                System.out.println(w + " : " + occurences);

            }
            rf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

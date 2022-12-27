package collections;

import java.io.*;
import java.util.HashMap;

/**
 * @param {string} str
 * @return {boolean}
 * 
 */

public class _HashMap {
    private int n;
    private int m;

    public static void main(String[] args) {
        testCode();
    }

    public _HashMap(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public int addNum() {
        return this.n + this.m;
    }

    public void countWords() {

        try {
            // write to file
            BufferedWriter wf = new BufferedWriter(new FileWriter("collections/hashMap.txt"));
            wf.write("who has the final say? \nI bet you that it is Jesus \nwho has the final say\n" +
                    "has the blokes whom we \nspared been able to init the \nvalues in their final sayings?");
            wf.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

        try {
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            // read from file and convert it to an array of strings
            BufferedReader rf = new BufferedReader(new FileReader("collections/hashMap.txt"));
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

    public static void testCode() {
        _HashMap hm = new _HashMap(10, 10);
        System.out.println(hm.m);
        System.out.println(hm.addNum());
        hm.countWords();
    }

}

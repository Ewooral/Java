package collections;

import java.util.*;

public class _ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(-12);
        al.add(3);
        al.add(78);

        // using iterator
        Iterator<Integer> i = al.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}

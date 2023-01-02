
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;

public class _ArrayList {
    public static void main(String[] args) {

        // Array List
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Add items
        System.out.println(".....CREATE....");
        al.add(1);
        al.add(-12);
        al.add(3);
        al.add(78);
        al.add(0, 45);
        System.out.println(al);

        // get element
        System.out.println(".....GET....");
        System.out.println(al.get(0));

        // Update an item
        System.out.println(".....UPDATE....");
        al.set(1, null);
        System.out.println(al);

        // remove
        System.out.println(".....DELETE ELEM....");
        al.remove(0); // index of element to remove
        al.remove(null); // the element to remove
        System.out.println(al);

        // sort elements
        System.out.println(".....SORT....");
        al.addAll(Arrays.asList(2, 4, 12, -9));
        al.sort(null);
        System.out.println(al);

        // get subarray of an array
        System.out.println(".....SUBARRAY....");
        System.out.println(al.subList(0, 3));
        System.out.println(al.subList(2, 4));

        // traverse using iterator
        System.out.println(".....TRAVERSE......");
        Iterator<Integer> i = al.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        // or
        System.out.println(".........");
        al.forEach(System.out::println);

        // clear all elem
        System.out.println("....CLEAR....");
        al.clear();
        System.out.println(al);

        // check the existence of some values in the list
        System.out.println("....CHECK EXISTENCE OF ELEMS IN LIST...");
        al.addAll(Arrays.asList(9, 0, 4, 2, 1, -7));
        System.out.println(al.containsAll(Arrays.asList(1, 4)));
        System.out.println(al.contains(90));

        // find the index of elem
        System.out.println("...INDEX OF AN ELEM...");
        System.out.println(al.indexOf(1));

        // compare two array objects
        System.out.println("...COMPARE EQUALITY OF TWO ARRAY OBJECTS...");
        System.out.println(al.equals(Arrays.asList(2, 4)));

        System.out.println("............");

        // Arrays
        int[] grades = new int[5];
        grades[0] = 90;
        grades[1] = 45;
        System.out.println(grades);

    }
}

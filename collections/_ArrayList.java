
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;

public class _ArrayList {
    public static void main(String[] args) {

        // Array List
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Add items
        al.add(1);
        al.add(-12);
        al.add(3);
        al.add(78);
        al.add(0, 45);

        System.out.println("...........");
        System.out.println(al);

        // get element
        System.out.println(al.get(0));

        // Update an item
        al.set(1, null);
        System.out.println(al);

        // remove
        al.remove(0); // index of element to remove
        al.remove(null); // the element to remove
        System.out.println(al);

        System.out.println("...........");
        ArrayList<String> students = new ArrayList<>(Arrays.asList("eli", "kb", "emma"));
        System.out.println(students);
        students.add("null");
        System.out.println(students);
        students.set(0, "Kwame");
        System.out.println(students);

        System.out.println("...........");
        // using iterator
        Iterator<Integer> i = al.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("............");

        // Arrays
        int[] grades = new int[5];
        grades[0] = 90;
        grades[1] = 45;
        System.out.println(grades);

    }
}
